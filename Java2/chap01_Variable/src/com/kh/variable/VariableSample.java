package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "����";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("�ȳ��ϼ���. " + name + "�Դϴ�." + " ���� " + hour + "�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score + "�Դϴ�");
		System.out.println(score + "���� ���� '" + grade + "' �Դϴ�");
		
		//������ �̸��� ���̿� �ڽ��� ���� (double)�� �ֱ�.
		
		int age = 28; 
		double score1 = 99.99;
		String name1 = "������";
		char  grade1= 'A';
				
		System.out.println("�ȳ��ϼ��� ���� �̸��� " + name1 + " �Դϴ�. ���� ���̴� " + age + "�� �̰� ���� ������ " 
				+ score1 + "�� �̸� ������ '" + grade1 + "' �Դϴ�.");
		
	}

}
