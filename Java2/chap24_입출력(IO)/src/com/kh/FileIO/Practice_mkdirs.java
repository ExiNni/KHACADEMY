package com.kh.FileIO;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.practice1();
		pm.Practice2();
		pm.Practice3();

	}

	public void practice1() {
		// ���� �������� 2�� �����
		// ���� �������� 3�� �����
		// ���� �������� 5�� �����
		String dirPath = "C:\\Users\\user1\\Desktop\\new\\new1";

		File dir = new File(dirPath);
		boolean success = dir.mkdirs();

		if (success) {
			System.out.println("���� ���� ����!");
		} else {
			System.out.println("���� ���� ����!");
		}
	}
	
	public void Practice2() {
		String dirPath = "C:\\Users\\user1\\Java_Workspace\\chap25";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("�ϼ�!");
		}else {
			System.out.println("����!!");
		}
	}
	
	public void Practice3() {
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kPop\\Group";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("5�� �ϼ�");
		} else {
			System.out.println("����");
		}
	}

}
