package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
			���ڿ��� �Է¹޾Ƽ� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������
			�� �� ° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			
			1. ���ڿ��� �Է� �޾�
			2. ���� �ϳ��ϳ� �迭�� �ְ�
			3. �˻��� ���� Scanner
			4. ���ڿ��� �� �� �� �ִ��� ������
			5. �� ��° �ε����� ��ġ�ϴ���
			6. �ε��� ����ϱ�
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String input = sc.next();
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���: ");
		char search = sc.next().charAt(0);
		
		char[] charString = input.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount: " + charCount);
		
		int count = 0;
		
		System.out.println(input + " �� " + search + " �� �����ϴ� ��ġ (�ε���)");
		
		for(int i = 0; i <= charCount; i++) {
			//���࿡ ���� �� ���ڸ� �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if(charString[i] == search) { 
				// charString[i]�� �������� �ƴ϶� i�� ������ searchChar �츮�� �˻��ؼ� ���ڰ��� ������ �ֱ� ������ 
				//���� �迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
			}	count ++;
		}
	
		
		
		/*
		 	���ڿ��� ���ڷ� ��ȯ = "�ȳ��ϼ���" -> "��" "��" "��" "��" "��"
		 	String -> char
		 	toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		 	
		 	�˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ���� (length) 
		 	�� ��° �ε����� ��ġ�ϴ��� �ε��� ���
		 	
		 	�� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		*/
	}
}
