package com.kh.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain run = new PracticeMain();
		run.practice1();
	}

	public void practice1() { // ��� �����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\myFile.txt");
			w.write("���ο� ������ �������.");
			w.close();

			FileReader reader = new FileReader("C:\\\\Users\\\\user1\\\\Desktop\\\\myFile.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}