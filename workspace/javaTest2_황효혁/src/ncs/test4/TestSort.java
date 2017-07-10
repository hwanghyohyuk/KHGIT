package ncs.test4;

public class TestSort {

	public static void main(String[] args) {
		int[] before = new int[10];
		int temp;
		for(int i =0; i<before.length;i++){
			before[i] = (int)(Math.random()*50)+51;
		}
		System.out.print("before : ");
		for(int i =0; i<before.length;i++){
			if( i<before.length-1){
			System.out.print(before[i]+", ");
			}else{
			System.out.println(before[i]);
			}
		}
		/*
		for(int i = 0;i<before.length;i++){
			for (int j=i+1;j<before.length;j++){//오름차순
				if(before[i]>before[j]){
					temp = before[i];
					before[i] = before[j];
					before[j] = temp;
				}
			}
		}
		*/
		for(int i = 0;i<before.length;i++){
			for (int j=i+1;j<before.length;j++){//내림차순
				if(before[i]<before[j]){
					temp = before[i];
					before[i] = before[j];
					before[j] = temp;
				}
			}
		}

		System.out.print("after : ");
		for(int i =0; i<before.length;i++){
			if( i<before.length-1){
			System.out.print(before[i]+", ");
			}else{
			System.out.println(before[i]);
			}
		}
	}

}
