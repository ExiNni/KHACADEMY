package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice7 {
	/*
	 * ���� ����� (���� ��� ��ȯ):
	 * 
	 * �޼��� �̸�: calculate
	 * 
	 * �Ű�����: �� ���� �Ǽ�(double Ÿ��) num1�� num2, �׸��� ������(String Ÿ��) operator ���: num1��
	 * num2�� operator�� ���� ���ϱ�, ����, ���ϱ�, ������ ������ �����ϰ� ����� ��ȯ��.
	 * 
	 */
	public static void calculator() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("ù ��° ����: ");
		double num1 = scanner.nextInt();

		System.out.print("������ (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		System.out.print("�� ��° ����: ");
		double num2 = scanner.nextInt();

		double result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			break;
		default:
			System.out.println("�߸��� �������Դϴ�.");
			return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}