package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {{"Apple", "Banana", "Cherry"},{"Grape", "Orange", "Strawberry"},{"Kiwi", "Mango", "pineapple"}};
		
		for(int i = 0; i < fruits.length; i++) {
			for(int a = 0; a < fruits.length; a++) {
				System.out.print(fruits[i][a] + " ");
			}
			System.out.println(); // ���������� �̵��� �� �ְ� enter �� ��� �޼ҵ� �Է�
		}
	}
}
