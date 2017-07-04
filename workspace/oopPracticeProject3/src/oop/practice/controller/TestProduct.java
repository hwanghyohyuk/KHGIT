package oop.practice.controller;

import oop.practice.model.Product;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1단계
		Product p1 = new Product("ssgnote6", "갤럭시 노트6", "경기도 수원", 960000, 1.0);
		Product p2 = new Product("lgxnote5", "LG 스마트폰5", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktnorm3", "KT 일반폰3", "서울시 강남", 25000, 0.3);
		//2단계
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);

		p1.setTex(0.5);
		p2.setTex(0.5);
		p3.setTex(0.5);
	
		
	
	}

}
