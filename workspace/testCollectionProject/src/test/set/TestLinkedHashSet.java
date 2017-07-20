package test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		//링크드 해시셋 
		//해시셋의 후손 클래스로 저장순서 유지기능 추가됨
		
		LinkedHashSet lhset = new LinkedHashSet();
		
		lhset.add("apple");
		lhset.add(156);
		lhset.add(1354.4);
		lhset.add(new Book());
		
		System.out.println(lhset.toString());
		
		Iterator Liter = lhset.iterator();
		while (Liter.hasNext()) {
			System.out.println(Liter.next());			
		}

	}

}
