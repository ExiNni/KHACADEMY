package com.kh.classCircle;

public class Circle {
	// ��� ����
	private static final double PI = 3.14;
	// private static final double PI = 3.14; -> ��µ�
	// private final double PI = 3.14; -> ��µ�
	// final double PI = 3.14; -> ��µ�
	private int radius = 1; // ����

	// ������
	public Circle() {
		// �⺻ ������
	}

	// �޼ҵ�
	// �������� ���� ���
	public void inRadius() {
		// ������ ���� ������ų ���� ������ �� �ִ�.
		radius++;
	}

	// ���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
	public void AreaCircle() {
		double area = PI * radius * radius;
		System.out.println("���� ���� : " + area);
	}

	public void SizeOfCircle() {
		System.out.println("���� ũ��(������): " + radius);
	}

}
