package com.kh.classSample;

public class Car {

	// 1. ���� �ʵ� �������
	String brand;
	String model;
	int speed;
	boolean engineOn;
	
	/* ==================================��� ���� �ؿ��� ��� �޼��� ============================*/
	
	// 2. �����ڴ� �޼����� �Ѱ��� ����
	public Car(String brand, String model) {// ���� �� �� �ʼ��� �ִ� �Ķ���ʹ� �귣��� ��
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
		System.out.println("Car ����: " + brand + ", " + model);
	}
	
	// ���� ���� �޼���
	public void startEngine() {// 
		// ���࿡ ������ true�̸� ���� �õ�
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");	// ��� �޼��� �ۼ�
		}else {
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");// ���࿡ ������ false�̸� ������ �̹� �����ִ�.

		}
		
	}
	public void accelerate(int amount) {
		if(engineOn) {
			// ������ true�� ���� �ӵ��� �󸶴�.
			System.out.println("�ӵ� " + amount + "km �Դϴ�.");

		}else {
			System.out.println("�ӵ��� �� �� ����");
			// ������ false�� ������ ���� �־� �ӵ��� �� �� ����.

		}

	}
}
