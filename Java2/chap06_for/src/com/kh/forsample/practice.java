package com.kh.forsample;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("------------------------------------------");
			System.out.println(i + "��");
			
			for(int j =1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			
			}
		}
		
		int a, b;
	
		System.out.println("ù ��° ���� �Է�: ");
		a = sc.nextInt();
		System.out.println("�� ��° ���� �Է�: ");
		b = sc.nextInt();
		System.out.println(a + "��: ");
		for(int i = 1; i <= b; i++) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
		
	}

}
