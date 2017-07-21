package test.map;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TestProperties2 {
	
	public static User[] readFile(Properties prop) {
		User[] users = null;
		try {
			prop.load(new FileReader("sample.txt"));
	//		System.out.println(prop.size());
			users = new User[prop.size()];
			Set setProp = prop.stringPropertyNames();
			Iterator iter = setProp.iterator();
			Enumeration keyList = prop.propertyNames();
			for(int i=0; keyList.hasMoreElements(); i++){
				String key = (String)keyList.nextElement();
				String value = prop.getProperty(key);
				String[] values = value.split(",");
				users[i] = new User(values[0], values[1], values[2]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	
	public static void printUsers(User[] users) {
		for( User u : users){
			System.out.println(u.toString());
		}
	}

	public static void main(String[] args) {

		Properties users = new Properties();
		printUsers(readFile(users));
	}

}
