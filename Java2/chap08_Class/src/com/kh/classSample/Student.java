package com.kh.classSample;

public class Student {
	
	String name;
	int age;
	String grade;
	
	/**************������ / �����ڴ� �޼��� �� �Ϻ�***************/
	
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		
	}
	// �л� ���� ��� �޼���
	public void displayInfo() {
		System.out.println("�л��� �̸���: " + name);
		System.out.println("�л��� ���̴�: " + age);
		System.out.println("�л��� �г���: " + grade);
	}
}