package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		/*
			3. ����������(Increment & Decrement)
			   ���������ڴ� ������ ���� 1�� ������Ű�ų� ���� ��ų�� ����Ѵ�.
			   ���� ���� ������(++a, --a)
			   	1-1) ���� ���� ������
			   			++ ���� ���� 1�� ���Ѵ�.
			   			val = ++num;	// num�� ���� 1 ������ �� val ������ ����
			   			val = --num;	// num�� ���� 1 ������ �� val ������ ����
			   
			   ���� ���� ������(a++, a--)
			   	1-2) ���� ���� ������			   
			
		*/
		
		int val, val2;
		int num1 = 10;
		val = ++num1; 

		System.out.println(val);	// num�� ���� 1 ������ �� val ������ ������ �ϱ� ������ 11�� ���Ե�
		
		val2 = --num1;
		System.out.println(val2);	// 11�� �� num�� ���� 1 ������ �� val2 ������ ������ �ϱ� ������ 10�� ���Ե�
		
		int val3, val4;
		int num2 = 10;
		
		System.out.println("num2�� �� : " + num2);
		val3 = num2++;	// val3 ������ ���� num2 ���� ������ �� num2 ���� 1������
		System.out.println("val3: " + val3);
		System.out.println("num2�� ��: " + num2);
		
		val4 = num2--;
		System.out.println("val4: " + val4);
		System.out.println("num2�� ��: " + num2);
		
		
					
	}

}
