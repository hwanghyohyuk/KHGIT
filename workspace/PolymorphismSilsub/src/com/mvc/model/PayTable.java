package com.mvc.model;

import com.mvc.view.Output;

public class PayTable extends Salary implements Calculate, Output{

	public PayTable(){
		super();
	}
	public PayTable(String name, long pay, int family, int overtime){
		super(name, pay, family, overtime);
	}
	
	@Override
	public void calc() {
		// 가족수당
		if (this.getFamily()<3) this.setFamilyP(this.getFamily()*20000);
		else this.setFamilyP(this.getFamily()*60000);
		// 성과금
		this.setIncenP((long)(this.getPay()*Salary.getIncentive()));
		// 시간외수당
		this.setOvertimeP(this.getOvertime()*5000);
		// 세금
		this.setTax((long)(this.getPay()*0.1));
		// 실수령액
		this.setTotalPay(this.getPay()+this.getFamilyP()+this.getIncenP()+this.getOvertimeP()-this.getTax());		
	}

	@Override
	public void out() {
			System.out.println(this.getName()+"\t"
					+this.getPay()+"\t\t"
					+this.getFamily()+"\t"
					+this.getFamilyP()+"  \t\t"
					+this.getOvertime()+"\t"
					+this.getOvertimeP()+"\t\t"
					+this.getTax()+"\t\t"
					+Salary.getIncentive()+"\t\t"
					+this.getIncenP()+"\t"
					+this.getTotalPay());
	}


}
