package com.kh.practice3.userScanner;

import java.util.Scanner;

public class UserScannerMain {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��ϼ���: ");
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("���� index : " + i);
			numbers[i] = sc.nextInt();


		}
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		System.out.println("�迭�� ��� ��Ҹ� ���� ���: " + sum);

	}

}
