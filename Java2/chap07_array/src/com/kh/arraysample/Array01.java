package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		/*
			Array
			���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
			
			������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ� �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
			�迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ� ���
			�������� ������ ���� �ٷ� �� �ֵ��� ������
			
			�迭�� ������: 
				�迭 ���� �� �ʱ�ȭ
				������ Ÿ��[] �迭 �̸� = new ������ Ÿ��[ũ��]
						
			Ư¡: 
				1. ������ ũ��: ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ �����ž����� - ���� �� ũ�� ���� �Ұ�
				2. ���� ������ Ÿ��: �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ������ �Ѵ�
					ex) int Ÿ���� �迭�� ��� ��Ұ� ����������
				3. index ��� ����: �� �迭 ��Ҵ� �������� �ε����� ������ 0 ���� �����ؼ� �迭 ũ�� -1���� ���� ����
								  �ε����� ����ؼ� Ư�� ��ġ�� �ִ� ��� ���� ����
					ex) �迭 ũ�� = 5�� �־��ٸ� index �� 0 ~ 4
				4. �迭�� ���̴�(length): �迭�� ���̸� �� �� �ִ�.
		*/
		int score1, score2, score3, score4, score5;
		// ���� score 1000�����? => �迭 ���
		int[] score = new int[5];
		
		String[] stringArray = new String[4];
		stringArray[0] = "��";
		stringArray[1] = "��";
		stringArray[2] = "��";
		stringArray[3] = "��";
		
		
		String[] nameArray = {"��泭", "�踻��", "ȫ�浿", "��ö��", "������"};
		// String[] nameArray = {"", "", "", "", ""}; => �ڸ��� 5�� ��������
		

		System.out.println("stringArray: " + stringArray[0]);
		System.out.println("stringArray: " + stringArray[1]);
		System.out.println("stringArray: " + stringArray[2]);
		System.out.println("stringArray: " + stringArray[3]);
		
		
		String[] food = {"ġŲ", "����", "����", "����"}; // index 3�� ¥��
		int foodLength = food.length;
		System.out.println("food �迭�� ����: " + foodLength);
		
		}

}
