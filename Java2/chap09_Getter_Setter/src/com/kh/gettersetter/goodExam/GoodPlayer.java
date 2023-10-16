package com.kh.gettersetter.goodExam;

import com.kh.gettersetter.PlayerCharacter;

public class GoodPlayer {

	private String name;
	private int health;
	private int attackPower;

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void isValidName() {
		if (this.name == "") {
			System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void isValidHealth() {
		if (health <= 0) {
			this.health = 0;
			System.out.println("ü���� �����ϴ�.");
		}
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public void isValidAttackPower() {
		if (attackPower <= 0) {
			this.attackPower = 0;
			System.out.println("���� �����մϴ�.");
		}
	}

	public void displayInfo() {
		System.out.println("ĳ���� ����: " + this.name);
		System.out.println("ü�� ����: " + this.health);
		System.out.println("���� �Ŀ� : " + this.attackPower);
		System.out.println("======================================");
	}

	public void attack(GoodPlayer target) {
		System.out.println("�����߽��ϴ�.");
		System.out.println("[" + this.name + "]�� [" + target.getName() + "]���� " + this.attackPower + " �������� �������ϴ�.");
		System.out.println("[" + target.getName() + "]�� ���� ü���� [" + (target.health - attackPower) + "] �Դϴ�");
		System.out.println("======================================");

	}

	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
		System.out.println("======================================");

	}

}

// void �� return �� ���� ���� �� ����
// void: ��ȯ���� ����
// return: ��ȯ���� ����
