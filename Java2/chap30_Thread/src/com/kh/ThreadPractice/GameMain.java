package com.kh.ThreadPractice;

import java.io.IOException;

public class GameMain {

	public static void main(String[] args) {
		GameMain run = new GameMain();
		run.practice1();
	}

	public void practice1() {
		// �ܺ� Ŭ������ �ν��Ͻ��� ����
		GameMain s = new GameMain();
		// ���� ���� ������ ����
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();

		// ���� ���� ���� : �÷��̾ ����Ű�� ������ ���� ����
		try {
			System.in.read();
			// ����ڰ� Ű����� �Է��� ����Ʈ�� ����
			// ����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			GameLoop.isGameOver = true;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}