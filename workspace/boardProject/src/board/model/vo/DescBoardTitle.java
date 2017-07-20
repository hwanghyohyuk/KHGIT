package board.model.vo;

import java.util.Comparator;

public class DescBoardTitle implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof Board && o2 instanceof Board) {
			Board b1 = (Board)o1;
			Board b2 = (Board)o2;
			
			result = (b1.getBoardTitle().compareTo(b2.getBoardTitle()));
		}//b2가 b1보다 클 경우(a, c) -2을 반환 (c,a) 2을 반환 같으면 0
		return result*-1;//1일때 바꿔라
	}
	
}
