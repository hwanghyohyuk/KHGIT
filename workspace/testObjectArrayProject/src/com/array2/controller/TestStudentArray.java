package com.array2.controller;

import java.util.Scanner;

import com.oop.array2.model.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		Scanner sc = new Scanner(System.in);
		int scount = 0;
		int scoreSum = 0;
		while (scount < students.length) {
			students[scount] = new Student();
			System.out.println("--------------------------------------------------------------");
			System.out.println("학생정보를 입력합니다.");
			System.out.println("--------------------------------------------------------------");
			System.out.print("이름 : ");
			students[scount].setName(sc.next());
			System.out.print("학년 : ");
			students[scount].setGrade(sc.nextInt());
			System.out.print("반 : ");
			students[scount].setGroup(sc.nextInt());
			System.out.print("번호 : ");
			students[scount].setSnum(sc.nextInt());
			System.out.print("나이 : ");
			students[scount].setAge(sc.nextInt());
			System.out.print("성별 : ");
			students[scount].setGender(sc.next().toUpperCase().charAt(0));
			System.out.print("점수 : ");
			students[scount].setScore(sc.nextInt());
			System.out.println("--------------------------------------------------------------");
			System.out.println("정보가 모두 입력되었습니다.");
			System.out.println("--------------------------------------------------------------");
			System.out.print("학생정보를 추가하시겠습니까? (y/n) : ");
			if (sc.next().toUpperCase().charAt(0) == 'Y') {
				scount++;
				continue;
			} else {
				break;
			}
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("입력된 정보들입니다.");
		System.out.println("이름, 학년, 반, 번호, 나이, 성별, 점수");
		for (int i = 0; i <= scount; i++) {
			System.out.println(students[i].studentInformation());
			scoreSum += students[i].getScore();
		}
		System.out.println("--------------------------------------------------------------");
		int scoreAve = scoreSum / (scount+1);
		System.out.println("현재 기록된 학생들의 점수의 평균 : "+scoreAve);
	}
}
