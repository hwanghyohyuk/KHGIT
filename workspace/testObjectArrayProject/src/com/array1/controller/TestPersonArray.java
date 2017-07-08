package com.array1.controller;

import java.util.Scanner;

import com.oop.array1.model.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[5];

		int pAgeSum = 0, pAgeAve;
		double pHeightSum = 0, pHeightAve;
		double pWeightSum = 0, pWeightAve;
		int pAssetSum = 0, pAssetAve;

		System.out.println("다섯 사람의 정보를 입력받습니다.");
		for (int i = 0; i < people.length; i++) {
			people[i] = new Person();
			System.out.println(i + 1 + "번째 사람 정보 입력");
			System.out.print("이름 : ");
			people[i].setName(sc.next());
			System.out.print("나이 : ");
			people[i].setAge(sc.nextInt());
			System.out.print("키 : ");
			people[i].setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			people[i].setWeight(sc.nextDouble());
			System.out.print("재산 : ");
			people[i].setAsset(sc.nextInt());
			System.out.println("정보가 입력되었습니다.");
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("이름, 나이, 키, 몸무게, 재산");
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].personInformation());
		}
		System.out.println("------------------------------------------------------------------");
		for (int i = 0; i < people.length; i++) {
			pAgeSum += people[i].getAge();
			pHeightSum += people[i].getHeight();
			pWeightSum += people[i].getWeight();
			pAssetSum += people[i].getAsset();
		}
		pAgeAve = pAgeSum / people.length;
		pHeightAve = pHeightSum / people.length;
		pWeightAve = pWeightSum / people.length;
		pAssetAve = pAssetSum / people.length;

		System.out.println("5명의 나이, 키, 몸무게, 재산의 평균은?");
		System.out.println("나이 : " + pAgeAve);
		System.out.println("키 : " + pHeightAve);
		System.out.println("몸무게 : " + pWeightAve);
		System.out.println("재산 : " + pAssetAve);
	}

}
