package com.oop.model.dto;

import java.util.Scanner;

public class Employee {
//	사번 : - empNo : int
//	이름 : - empName : String
//	소속부서 : - dept : String
//	직급 : - job : String
//	나이 : - age : int
//	성별 : - gender : char
//	급여 : - salary : int
//	보너스포인트 : - bonusPoint : double
//	핸드폰 : - phone : String
//	주소 : - addres : String
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String addres;
	
	
	//기본 생성자와 매개변수가 있는 생성자 선언
	public Employee() {
		this.empName ="";
	}
	
	public Employee( int empNo, String empName, String dept,	 String job, int age,
	 char gender, int salary, double bonusPoint, String phone, String addres ) {
		
	}
	
	//키보드 입력용 메소드
		public void empInput() {
			Scanner sc = new Scanner(System.in);
			System.out.print("사번 : ");
			this.empNo = sc.nextInt();
			System.out.print("사원 명 : ");
			this.empName=sc.next();
			System.out.print("부서 : ");
			this.dept=sc.next();
			System.out.print("직급 : ");
			this.job=sc.next();
			System.out.print("나이 : ");
			this.age=sc.nextInt();
			System.out.print("성별(M/F) : ");
			this.gender=sc.next().toUpperCase().charAt(0);
			System.out.print("급여 : ");
			this.salary=sc.nextInt();
			System.out.print("보너스 포인트 : ");
			this.bonusPoint=sc.nextDouble();
			System.out.print("핸드폰 : ");
			this.phone=sc.next();
			sc.nextLine();
			System.out.print("주소 : ");
			this.addres=sc.nextLine();
			System.out.println("입력을 완료했습니다.");			
		}
		
		//출력용 메소드
		public void empOutput() {
			System.out.println("*********** "+this.job+" "+this.empName+"의 정보 ************"
					+"\n사번 : "+this.empNo
					+"\n사원 명 : "+this.empName
					+"\n부서 : "+this.dept
					+"\n직급 : "+this.job
					+"\n나이 : "+this.age
					+"\n성별(M/F) : "+this.gender
					+"\n급여 : "+this.salary
					+"\n보너스 포인트 : "+this.bonusPoint
					+"\n핸드폰 : "+this.phone
					+"\n주소 : "+this.addres);
		}
	
	//값 변경용 메소드 선언
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int payCalculator() {
		return (int)((this.bonusPoint * this.salary)*12) ;
	}
}
