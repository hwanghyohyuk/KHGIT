package test.Sort;

public class testSelectSort {

	private int[] swap(int[] ar, int index1,int index2) {
		int temp;
		temp = ar[index1];
		ar[index1] = ar[index2];
		ar[index2] = temp;
		return ar;
	}
	
	public void selectSortDesc(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]<ar[j]){
					swap(ar, i, j);
				}				
			}
		}
	}

	public void selectSortAsc(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j]){
					swap(ar, i, j);
				}				
			}
		}
	}

	public static void main(String[] args) {
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			int r = (int) (Math.random() * 100) + 1;
			ar[i] = r;
		}
		System.out.println("생성");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}System.out.println();
		testSelectSort tss = new testSelectSort();
		tss.selectSortAsc(ar);

		System.out.println("오름차순");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}System.out.println();
		
		tss.selectSortDesc(ar);

		System.out.println("내림차순");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}System.out.println();
	}
}
