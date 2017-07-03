package oop.model;

//클래스 : 자료형이 다른 변수들의 묶음 + 접근제한 설정
//캡슐화 : 필드를 private 처리함
public class Student {
	//멤버변수(필드)
	//접근제한자 자료형 변수명;
	
	private int sno;					//학번
	private String sname;			//이름
	private String major;			//전공
	private double score;			//점수
	private String grade;			//학점
	private char gender;			//성별
	private String email;			//이메일
	private String phone;			//전화
	private String personID;		//주민번호
	private String professor;		//지도교수
	
	//지역변수는 final 만 가능 private

	//생성자 함수
	
	//멤버함수(메소드)
	public void printInformation(){
		System.out.println(sno+",\n"
				+sname+",\n"
				+major+",\n"
				+score+",\n"
				+grade+",\n"
				+gender+",\n"
				+email+",\n"
				+phone+",\n"
				+personID+",\n"
				+professor+",\n");
		
	}
	
}
