package productManager.controller;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import productManager.vo.Product;

public class FileController {
	public HashMap<String,Product> fileOpen() {//프로그램 START
		Properties prop = new Properties();
		HashMap<String,Product> temp = new HashMap<String,Product>();
		try {
			prop.load(new FileInputStream("product.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator<Entry<Object, Object>> it = prop.entrySet().iterator();

		while(it.hasNext()) {
			Entry<Object, Object> entry = it.next();
		    String key = (String)entry.getKey();		    
		    String value = (String)entry.getValue();
		    String[] values = value.split(",");
		    Product product = new Product(values[0], values[1], Integer.parseInt(values[2]), values[3]);
		    temp.put(key, product);
		}
		return temp;
	}

	public void fileSave(HashMap<String,Product> temp) {//프로그램 END
		Properties prop = new Properties();
		Iterator<Entry<String, Product>> it = temp.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Product> entry = it.next();
		    String key =entry.getKey();
		    String value = entry.getValue().toString();
		    prop.setProperty(key, value);
		}
		try {
			prop.store(new FileOutputStream("product.properties"), "product information");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
