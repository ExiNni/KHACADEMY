package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double korean, english, math;
		int korean2, english2, math2;
		
		System.out.print("���� ����: ");
		korean = sc.nextDouble();
		korean2 = (int)korean;
		System.out.print("���� ����: ");
		english = sc.nextDouble();
		english2 = (int)english;
		System.out.print("���� ����: ");
		math = sc.nextDouble();
		math2 = (int)math;
		
		System.out.println("����: " + korean);
		System.out.println("����: " + english);
		System.out.println("����: " + math);
		System.out.println("����: " + (korean2 + english2 + math2));
		System.out.println("���: " + ((korean2 + english2 + math2)/3));
	}

}