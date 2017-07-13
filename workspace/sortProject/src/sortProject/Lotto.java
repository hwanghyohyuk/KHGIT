package sortProject;

public class Lotto {

	public static void main(String[] args) {
		int Lotto[] = new int[6];
		for(int i=0; i<Lotto.length;i++){
			Lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++){
				if(Lotto[j]==Lotto[i]){
					i--;
					break;
				}
			}			
		}
		Sort sort = new Sort();
		sort.quicksort(Lotto);
		
		for(int l:Lotto){
			System.out.print(l+" ");
		}
	}

}
