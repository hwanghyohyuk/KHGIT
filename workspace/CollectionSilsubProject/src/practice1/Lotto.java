package practice1;

import java.util.TreeSet;

public class Lotto {

	public static void lottoDisplay() {
		TreeSet tset = new TreeSet();
		
		while (tset.size() < 6) {
			tset.add((int)(Math.random()*45)+1);			
		}	
		
		Object[] lottoObjects = tset.toArray();
		int[] lotto = new int[tset.size()];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(Integer) lottoObjects[i]; //auto unboxing
			//Unboxing
		}
		
		for(int l : lotto){
			System.out.print(l+"\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lotto().lottoDisplay();
	}

}
