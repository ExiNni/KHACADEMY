package com.kh.example.practice2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	public void Information() {
		System.out.println("������ �̸�: " + pName);
		System.out.println("������ ����: " + price);
		System.out.println("������ �귣��: " + brand);
	}
}
