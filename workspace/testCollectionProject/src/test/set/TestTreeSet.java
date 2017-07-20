package test.set;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
//자동 오름차순 정렬 기능이 내장된 TreeSet test
		TreeSet tset = new TreeSet();
		
		tset.add("orange");
		tset.add("melon");
		tset.add("apple");
		tset.add("kiwi");
		
		System.out.println(tset);

	}

}
