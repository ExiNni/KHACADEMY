package com.kh.instance.americano;

public class Americano {
	private int size; // �Ƹ޸�ī�� ������
	private boolean hasSugar; // ���� ����
	
	public Americano(int Size, boolean hasSuger) {
		this.size = Size;
		this.hasSugar = hasSuger;
	}
	
	public void makeCoffee() {
		System.out.println("�Ƹ޸�ī�븦 ����ϴ�.");
		System.out.println("ũ�� : " + size);
		
		// ���࿡ ������ �ִ´ٸ�!
		if(hasSugar) {
			System.out.println("������ �߰��մϴ�.");
		}
	}

}
