package board.model.vo;

import java.util.Comparator;

public class AscBoardDate implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof Board && o2 instanceof Board) {
			Board b1 = (Board)o1;
			Board b2 = (Board)o2;
			
			result = (b1.getBoardDate().getTime()>b2.getBoardDate().getTime())?1:((b1.getBoardDate().getTime()==b2.getBoardDate().getTime())?0:-1);
		}
		return result;
	}
	
}
