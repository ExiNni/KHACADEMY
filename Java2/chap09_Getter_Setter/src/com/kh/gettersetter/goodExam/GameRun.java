package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {

		GoodPlayer player1 = new GoodPlayer();
		player1.setName("KH");
		player1.isValidName();
		player1.setHealth(100); // ü���� ����
		player1.isValidHealth(); // setHealth ���� ���Ἲ���� �˻�
		player1.setAttackPower(50);
		player1.isValidAttackPower();
		player1.displayInfo();

		GoodPlayer player2 = new GoodPlayer();
		player2.setName("HK");
		player2.isValidName();
		player2.setHealth(50);
		player2.isValidHealth();
		player2.setAttackPower(20);
		player2.isValidAttackPower();
		player2.displayInfo();

		player1.attack(player2);
		player2.attack(player1);

	}
}
