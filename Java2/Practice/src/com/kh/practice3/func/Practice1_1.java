package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("�Է�");
		}else if(choice ==2) {
			System.out.println("����");
		}else if(choice ==3) {
			System.out.println("��ȸ");
		}else if(choice ==4) {
			System.out.println("����");
		}else if(choice ==7) {
			System.out.println("���α׷��� �����մϴ�.");
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}

}
