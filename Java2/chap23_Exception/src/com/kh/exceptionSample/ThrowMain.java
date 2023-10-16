package com.kh.exceptionSample;

import java.util.Scanner;

public class ThrowMain {
	/*
	 * Throw ���ܸ� �߻���Ű�� Ű���� ���α׷� ���� �� ����ġ ���� ��Ȳ�� �߻����� �� ��� ���ܸ� �߻���Ű�� ���� ó���� ���۵ǰ�
	 * ���α׷��� �ش� ���ܸ� ������ ó���ϰų� ���� ȣ�� ���� ���ܸ� ����
	 * 
	 * ex) user�� ���ڸ� �Է��ؾ� �� ����� �Է��ؾ��ϴµ� ������ �Է��� ������ ��� ���ܸ� �߻���Ű�� ������ ����
	 */
	public static void main(String[] args) {
		try {
			int number = getNumber(); // ���ڸ� ������ ��
			if (number < 0) {
				throw new NegativeNumberException("������ ����� ���� �ʽ��ϴ�.");
			}
			System.out.println("�Է��� ����: " + number);
		} catch (NegativeNumberException e) {
			System.out.println("���� �߻�!!!!" + e.getMessage());
		}

	}

	public static int getNumber() { // ����ڷ� ���� ���ڸ� �Է¹޴� �޼���
		// ���⿡�� ������ �Է��ϸ� ���ܰ� �߻��� ��!!
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int number = sc.nextInt();
		return number;
	}
}

