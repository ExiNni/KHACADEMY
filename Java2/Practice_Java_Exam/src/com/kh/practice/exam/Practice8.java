package com.kh.practice.exam;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ���: ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.println("====" + i + "��====");
				for(int j = 1; j <= 9; j++) {
					int mul = i * j;
					System.out.println(i + " * " + j + " = " + mul);
					
				}
			}
		}else {
			System.out.println("9 ���Ϸ� �Է����ּ���");
		}
	}

	
}

