package com.kh.exceptionPractice;

public class PractceMain {
	public static void main(String[] args) {
		PractceMain run = new PractceMain();
		//run.ArithException();
		//run.NullPointException();
		//run.NumFormatException();
		run.ExceptionExam();
	}
	public void ArithException() {
		// int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int dicvisor = 0;
		
		try {
			System.out.println("dividend / dicvisor  = " + dividend / dicvisor);
		} catch(ArithmeticException e) {
			System.out.println("���� �� �����ϴ�. " + e.getMessage());
		}
		
		
	}
	
	public void NullPointException() {
		String text = "Hello World";
		String subText = null;
		
		try {
			int length = text.indexOf(subText); // indexOf�� subText�ȿ� �ִ� null ���� ������ ���ڿ� �˻�
			System.out.println(length); 
		} catch(NullPointerException e) {
			System.out.println("subText�� Ȯ�����ּ��� : " + e.getMessage());
		}
		
		
		
	}
	public void NumFormatException() {
		
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(text);
		} catch(NumberFormatException e) {
			System.out.println("�ٽ� Ȯ�����ּ���: " + e.getMessage());
		}
		
	}
	
	public void ExceptionExam() {
		
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7; // ��ȿ���� ���� �ε��� �ѹ�
			int result = numbers[index]; // �迭 ��ҿ� ����
			System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			// �迭 �ε����� ������ ����� �� �߻��ϴ� ���� ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!" + e.getMessage());
		} catch(Exception e) {
			// �ٸ� ���ܸ� ó���� �� �ִ� ���� ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�" + e.getMessage());
		} finally {
			// �׻� ����Ǵ� ���
			System.out.println("Finally ����!");
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
}