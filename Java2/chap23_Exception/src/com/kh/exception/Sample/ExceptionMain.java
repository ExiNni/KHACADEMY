package com.kh.exception.Sample;

public class ExceptionMain {
	public static void main(String[] args) {
		ExceptionMain run = new ExceptionMain();
		run.ExceptionC();
		
	}
	
	public void ExceptionA() {
		try {
			int result = 10 / 0; // 0 ���� ������ �õ�
			System.out.println("result: " + result);

		} catch(ArithmeticException e) {
			/*
				ArithmeticException �������� ��� �������� �߻��ϴ� ����
				ArithmeticException e : e�� �츮�� ������ ������
				e�� ������ ������ �޼����� getMessage() �� ���޹޴´�.
			*/
			System.out.println("��� �������� ���� �߻��� ����!!" + e.getMessage());
		}
	}
	
	public void ExceptionB() {
		
		try {
			String text = null;
			int length = text.length(); // ������ ���µ� text �� ���� ���̸� ���
			System.out.println("text�� ����: " + length);
		}catch (NullPointerException e) {
			System.out.println("����� �� �����ϴ�." + e.getMessage());
		}
	}
	public void ExceptionC() {
		try {
			String juminNumber = "�ȿ���904";
			int number = Integer.parseInt(juminNumber); // ���ڿ��� ������ ��ȯ �õ�
			System.out.println("����: " + number); // �ȿ� String �� ����ֱ� ������ ������ ���� �ʴ´�
		} catch(NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�. " + e.getMessage());

		}
		
	}

}
