package com.kh.FileIO;

import java.io.File;

public class File_delete_Main {
	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "RealCute.jpg";
		
		// ���� ��ü ����
		File fileToDelete = new File(originFile);
		
		// ���� ���� 
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("���� ���� �Ϸ�");
		} else {
			System.out.println("���� ���� ����");
		}
	}
}
