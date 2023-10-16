package com.kh.abstractSample;

// �߻�Ŭ���� ����
abstract class Shape {
	// �Ϲ� �ʵ�
	private String color;

	// �߻� �޼��� (���� Ŭ�������� �����ؾ� ��)
	abstract double calculatorArea();
	

	// ������
	public Shape(String color) {
		this.color = color;
	}

	// �Ϲ� �޼��� (�޼���� return or void �� �־����)
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public static void main(String[] args) {
	}

}
