package com.kh.practice.exam;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			
			System.out.println(i);
		}
		if(num <= 0) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
		
	}

}


