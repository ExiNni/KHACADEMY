package com.kh.whilesample;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		boolean isChoice = false;
		
		while(!isChoice) {
			
			System.out.print("������ �������ּ���: ");
			int month = sc.nextInt();
	
			switch(month) {
			case 1 : case 2 : case 12 :
				System.out.println("�ܿ� �Դϴ�.");
				isChoice = true; // �� ! �� ���� ��� ���� �������� ����ǰ�, ������ ������ ����Ǳ� ������ true�� �ۼ�����
				break; // break �� case ������ �����ϰ��� �ϴ°� ����� �� �� ���� ����Ѵ�.
			case 3 : case 4 : case 5 :
				System.out.println("�� �Դϴ�.");
				isChoice = true;
				break;
			case 6 : case 7 : case 8 :
				System.out.println("���� �Դϴ�.");
				isChoice = true;
				break;
			case 9 : case 10 : case 11 :
				System.out.println("���� �Դϴ�.");
				isChoice = true;
				break;
			default :
				System.out.println("�߸� �� �����Դϴ� �ٽ� �Է����ּ���.");	
				System.out.println("");


			}
			

			
		}
		*/
		
		// ���̸� �Է� �޾� ����(19~20) û�ҳ�(14~18) ���(10~13)�� �з��Ѵ�
		// �� �� ���̴� �ٽ� �Է��ϼ��� ���
		// while switch case �̿��ؼ� ���
		
		boolean isTrue = true;
				
		while(isTrue) {
			
			System.out.print("���̸� �Է��ϼ���: ");
			int age = sc.nextInt();
			
			switch(age) {
			case 19 : case 20 :
				System.out.println("�����Դϴ�.");
				isTrue = false;
				break;
			case 14 : case 15 : case 16 : case 17 : case 18 :
				System.out.println("û�ҳ��Դϴ�.");
				isTrue = false;
				break; 
			case 10 : case 11 : case 12 : case 13 :
				System.out.println("��� �Դϴ�.");
				isTrue = false;
				break;
			default :
				System.out.println("���̸� �ٽ� �Է����ּ���");
				System.out.println("");
			}
		}
	}

}
