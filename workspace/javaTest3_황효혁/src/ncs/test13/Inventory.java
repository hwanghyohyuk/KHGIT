package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;

	public Inventory() {
		super();
	}

	public Inventory(String productName, Date putDate,int putAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
		this.inventoryAmount =putAmount;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdfI = new SimpleDateFormat("yyyy년 MM월 dd일 입고");
		SimpleDateFormat sdfO = new SimpleDateFormat("yyyy년 MM월 dd일 출고");
		if(this.getDate!=null){
			return this.productName +"\t"+
					sdfI.format(this.putDate.getTime()) +"\t"+
					this.putAmount  +"\t"+
					sdfO.format(this.getDate.getTime())	+"\t"+		
					this.getAmount  +"\t"+
					this.inventoryAmount;
		}else{
			return this.productName +"\t"+
					sdfI.format(this.putDate.getTime()) +"\t"+
					this.putAmount  +"\t"
					+"null,\t"+		
					this.getAmount  +"\t"+
					this.inventoryAmount;
		}	
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

}
