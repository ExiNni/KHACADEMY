package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double width, height;
		
		System.out.print("���� ���̸� �Է����ּ���: ");
		width = sc.nextDouble();
		
		System.out.print("���� ���̸� �Է����ּ���: ");
		height = sc.nextDouble();
		  
		System.out.println("������ ���̴� " + (width*height) + " �̸� �ѷ��� ���̴� " + 
		(2*(width+height)) + " �Դϴ�");
		
	
	}

}
