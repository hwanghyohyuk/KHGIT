package test.method;

import oop.staticmethod.StaticMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.setValue("hellow");
		System.out.println(StaticMethod.getValue());
		StaticMethod.toUpper();
		System.out.println(StaticMethod.getValue());
		System.out.println(StaticMethod.valueLength());
		StaticMethod.setChar(0,'b');
		System.out.println(StaticMethod.getValue());
		StaticMethod.valueConcat(" world!");
		System.out.println(StaticMethod.getValue());		
		}

}
