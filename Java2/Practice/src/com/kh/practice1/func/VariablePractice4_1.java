package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3�� �̻� ���ڿ��� �Է��ϼ���: ");
		String word = sc.next();
		
		// ���ڸ��� ���� ������ apple 1�ڰ� �Ѿ ����� �� �� ����
		// �ڸ� ��ġ ���ؼ� ����ϱ�
		char a1 = word.charAt(0); // ���ڸ� 1�ھ� ����
		char a2 = word.charAt(1);
		char a3 = word.charAt(2);
		
		System.out.println("ù ��° ����: " + a1);
		System.out.println("�� ��° ����: " + a2);
		System.out.println("�� ��° ����: " + a3);
		
		String p1 = word.substring(0,4); // �ܾ� �ϳ��� �ƴ϶� ������ ��� ����
		System.out.println(p1);
		
	}

}
