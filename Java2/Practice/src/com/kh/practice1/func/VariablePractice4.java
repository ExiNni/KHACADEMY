package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.print("3�� �̻� ���ڿ��� �Է��ϼ���: ");
		word = sc.nextLine();
        
		if (word.length() >= 3) {
            char firstChar = word.charAt(0);
            char secondChar = word.charAt(1);
            char thirdChar = word.charAt(2);

            System.out.println("ù ��° ����: " + firstChar);
            System.out.println("�� ��° ����: " + secondChar);
            System.out.println("�� ��° ����: " + thirdChar);
		}
		else {
			System.out.println("���ڸ� 3�� �̻� �Է��ϼ���.");
			
		}
        
	}

}
