package ncs.test11;

import java.util.*;

public class ListTest {
	public void display(List list) {
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print("\t"+iter.next());	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100)+1);
		}
		
		System.out.print("정렬 전 : ");
		new ListTest().display(list);
	
		list.sort(new Decending());
		
		System.out.print("정렬 후 : ");
		new ListTest().display(list);
	}
}
