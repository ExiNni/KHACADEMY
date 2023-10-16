package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain4 {

	public static void main(String[] args) {
		PracticeMain4 run = new PracticeMain4();
		run.practice4();

	}

	public void practice1() {
		String name = "KH";
		int age = 25;
		String formatString = String.format("�̸� : %s, ���� : %d", name, age);
		System.out.println("�̸�");
	}

	public void practice2() {
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("���� ��¥: %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);

	}

	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		// ���� �տ� 0�� �־��ְ� ������ %0d;
		// ���ڸ� 5�ڸ��� ����� �ְ� �ʹ� %05d;
		String formatString = String.format("���� 1: %d, ���� 2: %d", num1, num2);
		System.out.println(formatString);
		// String ������ = String.format()
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		// 10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
		// ���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
		// ���� ���ڿ��� 10�ڸ� ���� ª�ٸ� �����ʿ� �������� ä����
		// ���� ����ǥ ('') �� �ѷ� �׾ƾ���
		String formatStr = String.format("'%-10s' '%10s'",text1, text2);
		System.out.println(formatStr);
	}
}
