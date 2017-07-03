package oop.controller;

import oop.model.Product;

public class TestProduct {

	public static void main(String[] args){
		Product p1 = new Product("ssgnote6", "갤럭시노트6", "경기도수원", 960000, 10.0);
		p1.information();
		Product p2 = new Product("ssgnote6", "갤럭시노트6", "경기도수원", 960000, 10.0);
		p2.information();
		Product p3 = new Product("ssgnote6", "갤럭시노트6", "경기도수원", 960000, 10.0);
		p3.information();
	}
}
