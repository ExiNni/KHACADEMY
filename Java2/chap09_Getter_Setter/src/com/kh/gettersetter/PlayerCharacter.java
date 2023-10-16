package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; // ĳ���� �̸�
	private int health; // ü��
	private int attackPower; // �����Ŀ�

//	public PlayerCharacter(String name, int health, int attackPower) {
//		this.name = name;
//		this.attackPower = attackPower;
//		this.health = health;
//	}

	/*
	 * getter ������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ���� ���������ʹ� ������
	 */

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	/*
	 * setter �ܺο��� �޼ҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ� �޼ҵ�� �Ű���(=�Ű�����)�� �����ؼ� ������ ���� �����ͷ� ������ ��
	 * ����
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		// ���࿡ ü���� 0�̸� ���̰� ü���� 1�̻��̸� �츮��
		this.health = health;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	// ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ����: " + name);
		System.out.println("ü�� ����: " + health);
		System.out.println("���� �Ŀ� : " + attackPower);
	}

	// ĳ���� �����ϴ� ��� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println("[" + name + "]�� �����߽��ϴ�. [" + target.getName() + "]���� " + attackPower + " �������� �������ϴ�.");
		System.out.println("�����߽��ϴ�.");
	}

	// �ٸ� ĳ���ͷ� ���� ���� �޾��� �� �޼���

	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
	}

}
