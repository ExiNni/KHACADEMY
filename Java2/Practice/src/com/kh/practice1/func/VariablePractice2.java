package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		a = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		b = sc.nextInt();
		
		System.out.println("���ϱ� ���: " + (a + b));
		System.out.println("���� ���: " + (a - b));
		System.out.println("���ϱ� ���: " + (a * b));
		System.out.println("������ ���: " + (a / b));
		System.out.println("������ �� ���: " + (a % b));
	}

}
