package com.kh.variable;

public class VariableConversion {

	public static void main(String[] args) {
		// 1. �ڵ�����ȯ(�Ͻ�������ȯ, ����������ȯ)
		int intNum = 100;
		long longNum = intNum; //int�� long ���� �ڵ� ����ȯ
		
		System.out.println(intNum);//���� 100�� �ǹ�;
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float�� double�� �ڵ� ����ȯ
		
		System.out.println(floatNum);
		System.out.println(doubleNum);
		
		// int -> long �����ϴ� ����ȯ 2���� ����� ����ϱ�
		
		// short -> int �� �����ϴ� ����ȯ 1���� ����� ����ϱ�
		
		// float -> double �� �����ϴ� ����ȯ 1���� ����� ����ϱ�
		
		int intA = 12345;
		long longA = intA;
		
		int intB = 67890;
		long longB = intB;
		
		System.out.println(intA);
		System.out.println(longA);
		
		System.out.println(intB);
		System.out.println(longB);
		
		short shortC = 100;
		int intC = shortC;
		
		System.out.println(shortC);
		System.out.println(intC);
		
		float floatD = 123.456f;
		double doubleD = floatD;
		
		System.out.println(floatD);
		System.out.println(doubleD);
		
		// 2. ����� ����ȯ(���� ����ȯ)
		
		// long -> int
		long largeLong = 123456789012345L;
		System.out.println("largeLong :" + largeLong);
		int largeInt = (int) largeLong;
		System.out.println("largeInt : " + largeInt); 
		// long�� int�� ���� ����ȯ �� ��� ���� ���� �ȿ� ���� ������ �Ϻ� �����ʹ� �սǵȴ�.
		
		double largeDouble = 12345.6789;
		int intPart = (int) largeDouble;
		System.out.println(intPart); // �Ǽ��� int�� ���� ����ȯ�� �����θ� ǥ��
		
		// ���ڿ� ���ڰ��� ����ȯ 2�� ���
		// ���ڴ� char charValue = 'Z'; -> int�� ����
		char charBalue = 'Z';
		char charB = 'B';
		int int_Balue = charBalue;
		int int_B = charB;
		System.out.println("int_Balue: " + int_Balue);
		System.out.println("int_B: " + int_B);
	
		// double -> int�� ����ȯ 1�� ���
		double double_B = 123.456;
		int int_C = (int) double_B;
		System.out.println("int_C: " + int_C);
		
		//int�� short�� ����ȯ 1�� ���
		int int_D = 10;
		short short_D = (short)int_D;
		System.out.println("short_D: " + short_D);
	}

}
