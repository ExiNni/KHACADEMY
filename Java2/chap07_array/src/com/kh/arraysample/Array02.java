package com.kh.arraysample;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/*
			1. �迭�� ���̸� ����
			1 ~ 10 ������ �ݺ����� �̿��ؼ� ������ι迭 �ε����� ���� �� �� ���� ���
			
		*/
		
		/*
		int[] num = new int[10]; // ���̰� 3�� �迭 ����
		
		for(int i = 0; i < num.length; i++) {
			// ������� �迭 �ε����� ���� ���� ��
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		for(int j = 0 ; j < num.length; j++) {
			System.out.println(num[j]);
		}
		*/
		
		
		/*
		// �������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		int[] num1 = new int[10];
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = i + 1;
		}
		for(int i = num1.length - 1; i >= 0; i--) {
			System.out.println("num1[" + i + "] = " + num1[i]);
		}
		*/
		
		/*
		int[] numbers = new int[10];
		int value = 10;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = value--;
			System.out.println("numbers [" + i + "] = " + numbers[i]);
		}
		*/
		
		// ���̰� 5�� String �迭 ����
		// ��� �� ���� ������ ���ܷ� �ʱ�ȭ �� ��
		// �迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		
		/*
		String []fruit = new String [5];
		Scanner sc = new Scanner(System.in);
		
		fruit[0] = "���";
		fruit[1] = "��";
		fruit[2] = "����";
		fruit[3] = "������";
		fruit[4] = "����";
		

		for(int i = 0; i < fruit.length; i++) {
			fruit[i] = sc.next();
			System.out.print("��ȣ�� �Է����ּ���: ");
		}
		for(int i = 0; i < fruit.length; i++) {
			fruit[i] = sc.next();
		System.out.println("fruit " + i + ": " + fruit[i] );
		}
		*/
		
		String[] fruits = {"���", "��", "����", "������", "����"};
		System.out.println("�迭 �ε��� 1�� ��: " + fruits[1]);
		
	}
}
