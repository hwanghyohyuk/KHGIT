package sortProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sort = new Sort();
		int[] list = new int[10];
		
		for(int i=0;i<list.length;i++){
			list[i]=(int)(Math.random()*1000)+1;
		}
		sort.quicksort(list);
		
		for(int l : list){
			System.out.print(l+"\t");
		}
	}

}
