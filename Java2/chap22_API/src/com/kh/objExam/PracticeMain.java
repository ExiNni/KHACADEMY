package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�: ");
		String word1 = sc.next();

		System.out.print("�� ��° ���� �Է�: ");
		String word2 = sc.next();

		boolean isEqual = word1.equals(word2);
		if (isEqual) {
			System.out.println(word1 + "�� " + word2 + "�� �����ϴ�.");
		} else {
			System.out.println(word1 + "�� " + word2 + "�� ���� �ʽ��ϴ�.");
		}
	}

}
