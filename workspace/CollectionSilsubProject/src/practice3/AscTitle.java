package practice3;

import java.util.Comparator;

import practice2.Book;

public class AscTitle implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		if(o1 instanceof Book && o2 instanceof Book){
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
			result = b1.getTitle().compareTo(b2.getTitle());
			//오름차순은 반환값 그대로 해서 바꿈
		}
		return result;
	}

}
