package com.kh.forsample;

import java.util.Scanner;

public class for01 {

	public static void main(String[] args) {
		/*
			for���� ���α׷��ֿ��� �ݺ� �۾��� �����ϱ� ���� ���Ǵ� ������̴�
			Ư���� ������ �����ϴ� ���� �ڵ� ����� �ݺ� �����ϴµ� ���
			��κ��� ���α׷��� ���� for���� ���� ����
			for (�ʱ�ȭ; ����; ����){
				// ���ǽ��� ���� ��� �ݺ������� ������ �ڵ�
			}
			
			�ʱ�ȭ : �ݺ����� ���۵� �� �� ���� ����Ǵ� �κ�����, �ݺ� ������ �ʱ�ȭ �ϴ� ������ �Ѵ�.
			
			���ǽ� : �ݺ����� ����� ������ �˻��ϴ� �κ����� ������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ����
			
			������ : �ݺ� ������ ������Ű�ų� ���ҽ�Ű�� �κ�����, �ݺ� �ڵ带 ��� ���� �� ����  
		*/
		
		for (int i = 1; i <= 5; i++) {
			//���� i <= 5 ���� ��쿡 ����Ǵ� ����
			System.out.println(i);
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("i�� ��: " + i);
		}
		
		for(int i = 2; i <= 7; i++) {
			System.out.println("i�� ��: " + i);
		}
		
		for(int i = 10; i >= 5; i--) {
			System.out.println("i�� ��: " + i);
		}
		
		int sum = 0;
		for(int i =1; i <=10; i++) {
			sum += i;
			System.out.println("1���� 10������ ��: " + sum);
		}
		
		// sum�� ���� 1���� 5���� ������ ����ϱ�
		
		int sum1 = 0;
		for(int i =0; i <=5; i++) {
			sum1 += i;
		}
		System.out.println("sum: "+ sum1);
		
		int sum2 = 10;
		for(int i = 10; i >= 2; i--) {
			sum2 -= i;
			
		}System.out.println("sum2: " + sum2);
		
		int mul =1;
		for(int i = 1; i <= 9; i++) {
			mul = 2 * i;
			System.out.println("mul�� ����: " + mul);
		}
		
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				mul = i * j;
				System.out.println("mul�� ��: " + mul);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.print
		("�� ��° ���ڸ� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		
		int result = 0; // ���� ���� 0���� �ݴϴ�.
		for(int i = 0; i < num2; i++) {
			//for ������ ����ؼ� i ������ 0 ���� num2 �̸����� �ݺ�
			//�� ������ �� ��° ������ num2 ��ŭ �ݺ�
			result += num1;
			//result ������ num1 ���� ����
			//num2 ��ŭ num1�� ���ϴ� ȿ���� ��
		}
		System.out.println(num1 + " * " + num2 + " = " + result);
				
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				mul = i * j;
				System.out.println("������: " + mul);
			}
		}
		
		
		
	}
}
