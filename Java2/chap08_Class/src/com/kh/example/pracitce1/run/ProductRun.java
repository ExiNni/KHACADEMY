package com.kh.example.pracitce1.run;

import com.kh.example.pracitce1.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		
		Product myProduct1 = new Product("���ݷ�", 3000, "�Ե�");
		Product myProduct2 = new Product("���", 5000, "���ѱ�");
		Product myProduct3 = new Product("����", 1000, "���");
		
		myProduct1.information();
		myProduct2.information();
		myProduct3.information();
	
	}

}
