package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double width, length;
		
		System.out.print("���� ���̸� �Է��� �ּ���: ");
		width = sc.nextDouble();
		
		System.out.print("���� ���̸� �Է��� �ּ���: ");
		length = sc.nextDouble();
		
		System.out.println("����: " + (width * length));
		System.out.println("�ѷ�: " + ((width + length)*2));
		
	}

}
