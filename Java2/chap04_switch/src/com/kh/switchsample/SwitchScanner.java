package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("������ �������ּ���");

		int fruit = sc.nextInt();

		switch (fruit) {
		case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
		}
		*/

		
		  System.out.println("--------�޴���--------");
		  System.out.println("|   1�� �Ƹ޸�ī��      |");
		  System.out.println("|   2�� ī�� ��      |");
		  System.out.println("|   3�� ���ν����      |");
		  System.out.println("|   4�� ��� ����Ƽ     |");
		  System.out.println("---------------------");
		  System.out.print("��� ���� ��ȣ�� ����ּ���: ");
		  
		  int choice; 
		  choice = sc.nextInt();
		  
		  switch (choice) { 
		  case 1: 
			  System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�."); 
			  break; 
		  case 2: 
			  System.out.println("ī�� �󶼸� �ֹ��ϼ̽��ϴ�."); 
			  break; 
		  case 3:
			  System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�."); 
			  break; 
		  case 4:
			  System.out.println("��� ����Ƽ�� �ֹ��ϼ̽��ϴ�."); 
			  break; 
		  default:
			  System.out.println("�ֹ� ��ȣ�� �ٽ� Ȯ�����ּ���.");
		  
		  }
		 
		  System.out.println("���ڸ� ������. 1.����� 2.ĭ�� 3.������");
		  int yammy = sc.nextInt();
		  

			switch (yammy) {
			case 1:
				System.out.println("�����");
				break;
			case 2:
				System.out.println("ĭ��");
				break;
			case 3:
				System.out.println("������");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�.");
			

		  
		
	
	}

}
}
