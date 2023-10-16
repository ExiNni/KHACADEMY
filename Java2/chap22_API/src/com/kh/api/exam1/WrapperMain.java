package com.kh.api.exam1;

public class WrapperMain {
	public static void main(String[] args) {
		/*
			Wrapper �⺻ ������ ������ ��ü�� ����(wrap)
			��ü�� �۾��� �� ����
			Ŭ�����δ� Integer, Double, Boolean ���� ����
			
		*/
		Integer num = 40;
		System.out.println("������: " + num);
		
		// Wrapper Ŭ������ �⺻ ������ �������� ��ȯ
		int intValue = num.intValue();
		System.out.println("�⺻ ������ ���� ��: " + intValue);
		
		Double pi = 3.14159265359;
		
		// ���� ���� ���
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		System.out.println("���� ����: " + area);
		
		String numStr = "3.14";
		Double parsedDouble = Double.parseDouble(numStr);
		// parseInt, parsedDouble, String ���ڿ� �����͸� ����, �Ҽ��� ��ȯ�ϰڴ�
		System.out.println("���ڿ��� �Ǽ��� ��ȯ�� ��: " + parsedDouble);
		
		// Boolean Wrapper Ŭ���� �����
		Boolean isJavaFun = true;
		
		// ���ǹ� Ȱ��
		if(isJavaFun) {
			System.out.println("�ڹٴ� ��մ�");
		} else {
			System.out.println("�ڹٴ� ��̾���.");
		}
		 String boolStr = "true";
		 Boolean parseBool = Boolean.parseBoolean(boolStr);
		 System.out.println("���ڿ��� �Ҹ������� ��ȯ�� ��: " + parseBool);
	}
		
}
