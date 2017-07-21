package test.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.setProperty("drive", "oracle.jdbc.drive.OracleDrive");
		prop.setProperty("url", "www");
		
		
		System.out.println(prop);
		String drive = prop.getProperty("drive");
		String url = prop.getProperty("url", "not url");
		
		System.out.println(prop);
		
		prop.store(new FileOutputStream("drive.dat"), "jdbc oracle");
		prop.store(new FileWriter("driver.properties"), "properties");
		prop.storeToXML(new FileOutputStream("driver.xml"), "properties");

		prop.load(new FileReader("driver.properties"));
		prop.list(System.out);
		
		prop.load(new FileInputStream("driver.xml"));
		prop.list(System.out);

	}

}
