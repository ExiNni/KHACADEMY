package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	public static void main(String[] args) {
		// ���� �� ���� �Է¹޾� �� ���� �� �� �� ������ �� ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.print("ù ��° ���ڸ� �Է����ּ���: ");
		a = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է����ּ���: ");
		b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " % " + b + " = " + (a%b));
		
	}

}
