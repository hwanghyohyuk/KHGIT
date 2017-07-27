package productManager.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.table.DefaultTableModel;

import productManager.vo.Product;

public class ProductController {
	
	public void modeling(Object[][] temp,DefaultTableModel dtm) {//Object[][]을 table의 model로 변환 
		Object[][] oTemp = temp;
		for (int j = 0; j < oTemp.length; j++) {
			dtm.addRow(oTemp[j]);
		}
	}
	
	public Object[][] demodeling(DefaultTableModel dtm) {//table의 기록되어있는 값들을 Object[][] 배열로 변환
		Object[][] oTemp = new Object[dtm.getRowCount()][4];
		for (int i = 0; i < oTemp.length; i++) {
			for (int j = 0; j < 4; j++) {
				oTemp[i][j] = dtm.getValueAt(i, j);
			}
		}
		return oTemp;
	}
	
	public Object[][] transformHtoO(HashMap<String, Product> temp) {//HashMap에서 Object[][]로 변환
		Iterator<Entry<String, Product>> it = temp.entrySet().iterator();
		Object[][] oTemp = new Object[temp.size()][4];
		int i=0;
		while(it.hasNext()) {
			Entry<String, Product> entry = it.next();
		    String key = entry.getKey();
		    String value = entry.getValue().toString();
		    String[] values = value.split(",");
		    oTemp[i][0]=values[0];
		    oTemp[i][1]=values[1];
		    oTemp[i][2]=values[2];
		    oTemp[i][3]=values[3];
		    i++;
		}
		return oTemp;
	}
	public HashMap<String, Product>  transformOtoH(Object[][] oTemp) {//Object[][]에서 HashMap로 변환
		HashMap<String, Product> temp = new HashMap<String, Product>();
		for(int i=0;i<oTemp.length;i++){
			Product value = new Product((String)oTemp[i][0], (String)oTemp[i][1], Integer.parseInt((String)oTemp[i][2]), (String)oTemp[i][3]);
			String key = value.getpId();
			temp.put(key, value);
		}		
		return temp;
	}
}
