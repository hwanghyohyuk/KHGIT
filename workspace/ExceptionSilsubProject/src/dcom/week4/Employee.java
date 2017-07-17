package dcom.week4;

public class Employee implements Comparable<Employee> {
private String eName;
private int age;
private int salary;
private double taxRate;

public Employee() {
	super();
}

public Employee(String eName, int age, int salary, double taxRate) {
	super();
	this.eName = eName;
	this.age = age;
	this.salary = salary;
	this.taxRate = taxRate;
}

public double calculateSalary(){
	return this.salary-(this.salary*this.taxRate);
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public double getTaxRate() {
	return taxRate;
}

public void setTaxRate(double taxRate) {
	this.taxRate = taxRate;
}

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.eName.compareTo(o.geteName());
}


}
