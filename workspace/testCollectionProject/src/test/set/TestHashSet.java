package test.set;

import java.util.*;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet hset = new HashSet();
		
		hset.add(new String("apple"));
		hset.add("banana");
		hset.add(new  Integer(20));
		hset.add(new Double(1.15));
		hset.add(new Book());
		hset.add(77);//기본 자료형에 한해서만! 
		hset.add(3.54);//자동으로 객체로 변환해서 추가한다. auto boxing!
		
		System.out.println(hset);//Set은 저장순서 유지가 안됨
		
		//Set을 쓰는 이유 > 자동 중복 불가
		
		hset.add("apple");
		System.out.println(hset);
		System.out.println("저장된 갯수 : " + hset.size());
		
		if(hset.contains("banana"))
			hset.remove("banana");

		System.out.println(hset);
		System.out.println("저장된 갯수 : " + hset.size());
		//Set은 저장순서가 유지 안되기 때문에 하나의 원소만 추출 불가, 메소드 없음
		
		//Set에 저장된 객체들의 연속추출 처리할 경우
		//1. 목록만들고 >  목록으로 연속처리
		Iterator setIter =  hset.iterator();		
		while (setIter.hasNext()) {
			System.out.println(setIter.next());			
		}
		//2. 배열 만들고 > 배열에 대한 반복문 처리
		Object[] setArr = hset.toArray();
		for(Object o : setArr){
			System.out.println(o.toString());
		}
		hset.clear();
		System.out.println(hset.isEmpty());
		System.out.println(hset.size());
	}
}
