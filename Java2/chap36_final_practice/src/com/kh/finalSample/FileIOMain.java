package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {

	public void FileWriter() {
		try {
			FileWriter fw = null;
			fw = new FileWriter("��������.txt", true); // 2��° ������ ���� boolean true �����Ǹ� �ش� ���Ͽ� �̾��
			fw.write("1000");
			fw.write("10000");
			fw.write("10000");

			fw.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	public static void main(String[] args) {
		FileIOMain run = new FileIOMain();
		run.FileWriter();
	}
}