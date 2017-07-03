package oop.model;

public class Product {
	private String productID;
	private String productName;
	private String productArea;
	private int price;
	private double tex;
	
	public Product(){}
	
	public Product(String pID,String pName,String pArea,int price,double tex) {
		// TODO Auto-generated constructor stub
		this.productID = pID; 
		this.productName = pName; 
		this.productArea = pArea; 
		this.price = price; 
		this.tex = tex; 
	}
	public void information(){
		String productID=this.productID;
		String productName=this.productName;
		String productArea=this.productArea;
		int price=this.price;
		double tex=this.tex;
		
		System.out.println(productID+"\t"+productName+"\t"+productArea+"\t"+price+"\t"+tex);
	}
}
