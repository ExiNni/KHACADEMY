package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("���̸� �Է��� �ּ���: ");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴� " + age + "�� �Դϴ�");
		
		String name;
		String phoneNumber;
		
		System.out.print("����� �̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("����� ��ȭ��ȣ�� �Է��ϼ���: ");
		
		phoneNumber = sc.next();
		System.out.print("����� �̸��� " + name +  "�Դϴ�. ����� ��ȭ��ȣ�� " + phoneNumber + "�Դϴ�.");
		*/
		
		// �� ��̿� ���� �����ϴ� ���İ� �� �ּ� ����ϱ�
		String hobby, food, address;
		
		System.out.print("�� ��̸� �Է����ּ���: ");
		hobby = sc.next();
		System.out.print("���� �����ϴ� ������ �Է����ּ���: ");
		food = sc.next();
		System.out.print("�� �ּҸ� �Է����ּ���: ");
		address = sc.nextLine();
		address = sc.nextLine();
	
		
		
		
		System.out.println("���� ��̴� " + hobby + "�̸� ���� �����ϴ� ������ " + food + "�̰�"
				+ " ���� �ּҴ� " + address + " �Դϴ�.");
		
	}

}
