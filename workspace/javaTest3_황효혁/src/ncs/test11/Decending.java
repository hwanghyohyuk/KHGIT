package ncs.test11;

import java.util.Comparator;

public class Decending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int result=0;
		if(o1 instanceof Integer && o2 instanceof Integer){
			int i1 = (Integer)o1;
			int i2 = (Integer)o2;
			result=(i1<i2)?1:(i1==i2)?0:-1;	
		}
		return result;
	}

}
