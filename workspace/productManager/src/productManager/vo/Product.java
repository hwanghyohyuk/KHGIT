package productManager.vo;

import java.io.Serializable;

public class Product implements Serializable{
private String pId;
private String pName;
private int price;
private String description;

public Product() {
	super();
}
public Product(String pId, String pName, int price, String description) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.price = price;
	this.description = description;
}
public String getpId() {
	return pId;
}
public void setpId(String pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pId+","+this.pName+","+this.price+","+this.description;
	}


}
