package com.kh.superSample;
// ��� �޾Ƽ� super() super. ������ Ȯ��
/*
	super = �θ� Ŭ������ ������ �޼��忡 �����ϱ� ���� ���
	super() = �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ��� ����Ŭ������ �����ڿ��� ù ��° �ٿ� ȣ�� �Ǿ�� ��
	
*/
//           �ڽ�   ��ӹ޴´�  �θ�
public class Child extends Parent{
	// Child() �� ���� ���������ڰ� default�� ����� ���� �� public�̶� ������ �Ȱ���
	public Child(){
		super(); // �θ� Ŭ������ �⺻ ������ ȣ��
		System.out.println("�ڽ� Ŭ������ �⺻ �������Դϴ�.");
	}
	
	public Child(String name) {
		super(name); // �θ� Ŭ������ ���ڿ� �Ķ���� ������ ȣ��
		System.out.println("�ڽ� Ŭ������ ���ڿ� �Ķ���� �������Դϴ�.");
	}
	
	public void display() {
		super.show(); // �θ� Ŭ������ show ��� �޼��� ȣ��
		System.out.println("�ڽ� Ŭ������ display �޼��� �Դϴ�.");
	}
}
