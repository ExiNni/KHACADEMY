package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		
		
		while(isTrue) { // isTrue = True�̱� ������ true ��� ���
			System.out.println("1. �Ƹ޸�ī��");
			System.out.println("2. īǪġ��");
			System.out.println("3. ���� ��ũƼ");
			System.out.print("Ŀ�Ǹ� �ֹ����ּ���: ");
			int choice = sc.nextInt(); 
			
			switch(choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�븦 �ֹ�!");
				isTrue = false; // �Ƹ޸�ī�븦 �ֹ������� while���� �����ϱ� ���ؼ� false�� �ִ´�.
				break;
			case 2:
				System.out.println("īǪġ�븦 �ֹ�!");
				isTrue = false;
				break;
			case 3:
				System.out.println("���� ��ũƼ�� �ֹ�!");
				isTrue = false;
				break;
			default:
				System.out.println("�߸� �ֹ��߽��ϴ� �ٽ� �ֹ����ּ���");
				System.out.println("");
			}

		}
		
	}
}
