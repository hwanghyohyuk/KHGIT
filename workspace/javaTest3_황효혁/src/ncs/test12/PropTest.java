package ncs.test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();

		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		 //명시한 사용 데이터를 prop 에 기록한다.
		//{1=apple,1200,3, 2=banana,2500,2, 3=grape,4500,5, 4=orange,800,10, 5=melon,5000,2}

		 // fileSave() 메소드를 호출한다.
		new PropTest().fileSave(prop);
		 // fileOpen() 메소드를 호출한다.
		new PropTest().fileOpen(prop);

	}

	public void fileSave(Properties p){
		
		try {
			p.storeToXML(new FileOutputStream("data.xml"), null,"UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen(Properties p){
		Fruit[] fruits= new Fruit[5];
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set set = p.entrySet();
		Iterator iter = set.iterator();		
		while (iter.hasNext()) {
			Entry entry = (Entry) iter.next();
			int key = Integer.parseInt(((String) entry.getKey()))-1;
			String value = (String) entry.getValue();
			String values[] = value.split(",");
			fruits[key] = new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
		}		
		for(int i=0;i<fruits.length;i++){
			System.out.println((i+1)+" = "+fruits[i].getName()+", "+fruits[i].getPrice()+"원, "+fruits[i].getQuantity()+"개");
		}
	}
	
}
