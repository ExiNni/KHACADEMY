package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice4 {

	public void Practice4() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�迭 ũ�� �Է�: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			System.out.println((i + 1) + " ��° ���� �Է�: ");
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
			
		}
		
		System.out.println("sum: " + sum);


	}
}
