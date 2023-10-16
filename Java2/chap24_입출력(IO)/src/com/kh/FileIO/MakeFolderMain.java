package com.kh.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {

		MakeFolderMain run = new MakeFolderMain();
		run.practice2();

	}

	public void practice1() {
		// ������ ������ ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop\\image"; // ���ϴ� ��� ����
		// ���� �����
		// MakeFolderMain run = new MakeFolderMain();

		File folder = new File(folderPath);

		// exists �̹� �����ϴ��� Ȯ��
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�");
		}
		folder.mkdir();

		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\image.txt");
			w.write("������ ������ ��� ���Դϴ�.");
			w.write("KH �л�");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void practice2() {
		String folderPath = "C:\\Users\\user1\\Desktop\\new_FOLDER1";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ �ϼ�");
		}else {
			System.out.println("�̹� ������ �ִ�.");
		}
		try {
			FileWriter w = new FileWriter("C:\\\\Users\\\\user1\\\\Desktop\\\\new_FOLDER1\\new.txt");
			w.write("Testing.\n");
			w.write("Testing2\n");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
