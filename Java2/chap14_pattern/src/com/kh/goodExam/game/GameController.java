package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {

	private GameModel model;
	private GameView view;

	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}

	public void runGame() {
		// ���� �޼��� �����ִ°� ����ϰ�
		view.displayMessage();
		// ��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);

		boolean isTrue = true;
		while (true) { // false �� �� �� ���� �ݺ�

			// ���� �����ϴ� ���� �Է�����
			view.displayGuessPrompt();
			int guess = sc.nextInt();

			if (model.inCorrectGuess(guess)) {
				// ��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				break;
			} else {
				// ��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� ��
				view.displayIncorrectGuess();
				view.displayAttempts(model.getAttempts());
			}

		}
	}

	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);

		c.runGame();
	}

}
