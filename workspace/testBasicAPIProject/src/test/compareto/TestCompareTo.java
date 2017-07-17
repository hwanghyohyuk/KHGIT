package test.compareto;

import javax.swing.JComponent;

public class TestCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "Java";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
		String[] sArr = {"grape", "melon", "apple", "orange"};
		for (String s : sArr){
			System.out.print(s+"\t");
		}System.out.println();
		
		String[] copyArr = new String[sArr.length];
		System.arraycopy(sArr, 0, copyArr, 0, sArr.length);
		
		for(int i=0; i<copyArr.length;i++){
			for(int j=i+1; j<copyArr.length;j++){
				if (copyArr[i].compareTo(copyArr[j])>0) {
					String tmp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = tmp;
				}
			}
		}
		for (String s : copyArr){
			System.out.print(s+"\t");
		}System.out.println();
	}

}
