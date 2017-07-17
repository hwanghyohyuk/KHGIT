package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import dcom.week4.Employee;

public class TestWork3 {

public static void main(String[] args) {
	BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
	
	ArrayList<Employee> Employee = new ArrayList<Employee>();
	
	String eName = null;
	int age = 0;
	int salary = 0;
	double taxRate = 0;
	char more = 0;
	
	do{
		System.out.println("총 사원수 : " + Employee.size()+"명");
		System.out.println("--------------------------------------------------------");
		try {
			System.out.print("사원 명 : ");
			eName = inbr.readLine();
			System.out.print("나이 : ");
			age = Integer.parseInt(inbr.readLine());
			System.out.print("급여 : ");
			salary = Integer.parseInt(inbr.readLine());
			System.out.print("세율 : ");
			taxRate = Double.parseDouble(inbr.readLine());
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("숫자를 잘못 입력 하셨습니다.");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("잘못 입력 하셨습니다.");
		}
		Employee emp = new Employee(eName, age, salary, taxRate);
		Employee.add(emp);
		System.out.println("--------------------------------------------------------");
		System.out.println("더 입력하시겠습니까? (y/n)");
		try {
			more = inbr.readLine().toUpperCase().charAt(0);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("잘못 입력 하셨습니다.");
		}
		System.out.println("--------------------------------------------------------");
	}while(more=='Y');	
	System.out.println("사원 리스트 \t 총 사원 수 : "+Employee.size());
	System.out.println("--------------------------------------------------------");
	System.out.println("사원 명\t\t나이\t\t급여\t\t실급여");
	Collections.sort(Employee);
	for(Employee e : Employee){
		System.out.println(e.geteName()+"\t\t"+e.getAge()+"\t\t"+e.getSalary()+"\t\t"+e.calculateSalary());
	}
	System.out.println("--------------------------------------------------------");	
}
}

