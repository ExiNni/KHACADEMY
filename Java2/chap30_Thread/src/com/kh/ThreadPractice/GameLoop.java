package com.kh.ThreadPractice;

import java.util.Random;

public class GameLoop implements Runnable {
	public static boolean isGameOver;

	@Override
	public void run() {

		while (!isGameOver) {
			// ���� ���� ������ �ְڴ�
			int randomValue = new Random().nextInt(10);
			System.out.println("������ ���� : " + randomValue);

			// ���� ���� ���� �ð�
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("������ �����Ϸ��� Enter�� �Է��ϼ���");
		}
	}
	
}
