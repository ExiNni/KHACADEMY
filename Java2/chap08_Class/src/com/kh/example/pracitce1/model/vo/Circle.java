package com.kh.example.pracitce1.model.vo;

public class Circle {

	double pi = 3.14;
	int radius = 1;
	
public Circle() {
	// �ƹ��� �ʱ�ȭ�� ���� ����
}
	
public void incrementRadius() {
	int radius2 = 2 * radius;
	System.out.print("�������� ���� ����: ");
	System.out.println((pi * (radius2 * radius2)));
	
	}
public void getAreaOfCircle() {
	System.out.print("���� ����: ");
	System.out.print((pi * (radius * radius)));
	System.out.println();
}
public void getSizeOfCircle() {
	System.out.print("���� �ѷ�: ");
	System.out.print((2 * pi * radius));
	System.out.println();
}
}
