package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice6 {

	public static void Practice6() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		int num = scanner.nextInt();

		boolean isPrime = isPrimeNumber(num);

		if (isPrime) {
			System.out.println("�Ҽ� �Դϴ�.");

		} else {
			System.out.println("�Ҽ��� �ƴԴϴ�.");

		}
		
	}

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			System.out.println("2���� ū ���� �Է��ϼ���.");
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;

			}
		}
		return true;
		

	}
}