package oop.method;

public class Main {

	public static void main(String[] args){
		NonStaticSample nss = new NonStaticSample();
		nss.intArrayAllocation(10);
		nss.display(nss.getArray());
		nss.display(nss.sortAscending(nss.getArray()));
		nss.display(nss.sortDecending(nss.getArray()));
		
		
	}
}
