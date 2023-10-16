package com.kh.operator;

import javax.xml.transform.Templates;

public class Ternary {

	public static void main(String[] args) {

		/*
			6. ���� ������
				������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ�մϴ�.
				���� ? ��1 : ��2 ���·� ���
				
				���� = ���� ? ���� : ����
				
		*/

		// ex) ���̰� 20�̻��� �����ΰ� �̼������ΰ�?
		int age = 20;
		// (����) ? ��1 : ��2 -> �� 1�� ������ ���� �� ���, �� 2�� ������ ������ �� ���
		String status = (age >= 20) ? "����" : "�̼�����";
		System.out.println("status: " + status);
		
		int score = 85;
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println("���� ���: " + result);
		
		int number = 5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign: " + sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "������ ����" : "�߿� ����";
		System.out.println("���� ���´�: " + weather);
		
		//���� 7�� ���� ¦������ Ȧ������ ���
		
	int a = 7;
	String b = (a % 2 == 0) ? "¦�� �Դϴ�" : "Ȧ�� �Դϴ�";
	System.out.println("���� 7��: " + b);
	
	int number2 = -5;
	String sign2 = (number2 > 0) ? "���" : (number2 < 0) ? "����" : "0";
	System.out.println("sign2��: " + sign2);
	
	}

}
