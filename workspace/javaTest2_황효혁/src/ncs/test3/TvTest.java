package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv tvArray [] = new Tv[3];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String mins = null,maxs = null;
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");

		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");

		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		
		for (int i = 0; i < tvArray.length; i++) {
			System.out.println(tvArray[i].toString());
			if(min>tvArray[i].getPrice()){
				min = tvArray[i].getPrice();
				mins= tvArray[i].getName();
			}
			if(max<tvArray[i].getPrice()){
				max = tvArray[i].getPrice();
				maxs= tvArray[i].getName();
			}
			
		}
		System.out.println("가격이 가장 비싼 제품 : "+maxs);
		System.out.println("가격이 가장 저렴한 제품 : "+mins);
	}

}
