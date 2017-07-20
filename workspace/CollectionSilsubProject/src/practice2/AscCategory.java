package practice2;

import java.util.Comparator;

public class AscCategory implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof Book && o2 instanceof Book){
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
			if(b1.getCategory()>b2.getCategory()){//두번째 객체가 첫번째 객체보다 작으면
				return 1;//오름차순이니까 바꿔야한다는 1을 반환
			}else if(b1.getCategory()==b2.getCategory()){
				return 0;
			}else{
				return -1;
			}
		}					
		return 0;
	}
	/*
	 * 나만의 코딩
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1.getCategory()>o2.getCategory()){//두번째 객체가 첫번째 객체보다 작으면
			return 1;//오름차순이니까 바꿔야한다는 1을 반환
		}else {
			return 0;
		}			
	}
	*/
}

//1을 반환하면 "바꾼다" 라는뜻
