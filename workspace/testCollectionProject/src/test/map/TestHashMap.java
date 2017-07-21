package test.map;

import java.util.HashMap;

import test.set.Book;

public class TestHashMap {

	public static void main(String[] args) {
		// HashMap test
		HashMap<Object, Object> hmap = new HashMap<>();
		
		//맵은 항상 키와 값 객체를 쌍으로 저장함
		hmap.put("one", new Book());
		hmap.put(2, "red apple");
		hmap.put("two", new Book());
		hmap.put(1, "apple");
		hmap.put(0, "a");
		hmap.put("a","hhh");
		hmap.put("b","hhh");
		hmap.put("z", "hhh");
		hmap.put(9, "nine");
		hmap.put(10, "nine");
		hmap.put(11, "nine");
		hmap.put(12, "nine");
		hmap.put(13, "nine");
		hmap.put(14, "nine");
		hmap.put(26, "m");
		hmap.put(3,	"3");
		hmap.put(8,	"3");
		hmap.put(7,	"3");
		hmap.put(6,	"3");
		hmap.put(5,	"3");
		hmap.put(4,	"3");

		hmap.put("C",	"3");
		hmap.put("c",	"3");

		hmap.put("d",	"3");

		hmap.put("e",	"3");
		hmap.put("f",	"3");

		hmap.put("four",	"3");

		hmap.put("three",	"3");
		
		
		//Auto Boxing
		System.out.println(hmap);
		//key는 Set방식으로 저장됨
		
		
	}

}
