package com.kh.test2;

/**
 * 회원 정보 관리용 클래스
 * 2017년 6월 22일 작성
 * 작성자 : 황 효혁
 *
 */

public class Member {
	Student st;
	
	/**
	 * 회원이름 저장용 필드
	 */
	private String name;
	
	/**
	 * 회원 아이디 저장용 필드
	 */
	private String id;
	
	/**
	 * 회원 암호 저장용 필드
	 */
	private String passward;
	
	/**
	 * 기본 생성자
	 */
	public Member(){
		
	}
	/*
	 * 모든 필드를 초기화 시키는 매개변수가 있는 생성자
	 */
	public Member(String name,String id,String passwad){
		this.name = name;
		this.id = id;
		this.passward = passwad;
	}
}
