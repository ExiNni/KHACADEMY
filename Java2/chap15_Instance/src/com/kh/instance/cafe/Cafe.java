package com.kh.instance.cafe;

public class Cafe {
	String type;
	int size;
	boolean isSugar;
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
		
	}
	
	public void Sugar() {
		if(isSugar == true) {
			System.out.println("������ �߰��մϴ�.");

		}else {
			System.out.println("������ ���� �ʽ��ϴ�.");
		}
	}
	
	public void size() {
		System.out.println("Ŀ�� ũ��: " + size);
	}
	
	public void type() {
		System.out.println("Ŀ�� ����: " + type);
	}
}
