package oop.method;

public class NonStaticSample {
	private int[] intArray = null;
	
	public NonStaticSample(){}
		
	public void intArrayAllocation(int arraySize){
		int array[]=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			int r = (int)(Math.random()*100)+1;
			array[i]=r;
		}
		this.intArray=array;
	}
	
	public int[] getArray(){
		return  this.intArray;
	}
	
	public void display(int[] arr){
		for(int i : arr){
			System.out.print(i+" ");	
		}	
		System.out.println();
	}
	
	public void swap(int[] arr,int index1, int index2) {
		int tmp;
		tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	public int[] sortDecending(int[] arr) {
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j])swap(arr,i,j);
			}
		}
		return arr;
	}
	
	public int[] sortAscending(int[] arr) {
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j])swap(arr,i,j);
			}
		}
		return arr;
	}
	
	public int countChar(String str, char ch) {
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch)
				count++;
		}		
		return count;
	}
	
	public int totalValue(int num1, int num2) {
		int sum=0;
		int tmp;
		if(num1>num2){//num1 이 작은수가 되도록
			tmp=num1;
			num1=num2;
			num2=tmp;
		}
		for(int i=num1;i<=num2;i++)
			sum+=i;
		return sum;
	}
	
	public char pCharAt(String str, int index) {
		return str.charAt(index);
	}
	
	public String pConcat(String str1, String str2) {
		return str1+str2;
	}
}
