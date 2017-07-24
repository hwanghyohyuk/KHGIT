package ncs.test13;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7", new Date(2016, 3+1, 15), 30));
		map.put("LG G5", new Inventory("LG G5", new Date(2016, 2+1, 25), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", new Date(2016, 1+1, 23), 15));
	
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Entry entry = (Entry) iter.next();
			String key =(String) entry.getKey();
			Inventory value = (Inventory) entry.getValue();
			
			System.out.println(value.toString());
		}
		Inventory[] invens = (Inventory[]) set.toArray();
	
	
	}

}
