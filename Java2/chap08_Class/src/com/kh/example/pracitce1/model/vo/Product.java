package com.kh.example.pracitce1.model.vo;

public class Product {

	String pName;
	int price;
	String brand;
	
	public Product(String pName, int price, String brand) {
		this.brand = brand;
		this.pName = pName;
		this.price = price;
	}
	public void information() {
		System.out.println("��ǰ �̸�: " + pName);
		System.out.println("��ǰ ����: " + price + "��");
		System.out.println("��ǰ �귣��: " + brand);
	}
}
