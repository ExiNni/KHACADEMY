package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
		colors.add("����");
		colors.add("��Ȳ");
		colors.add("���");
		colors.add("�ʷ�");
		colors.add("�Ķ�");
		colors.add("����");
		colors.add("����");
		
		System.out.println("��ü����: " + colors);
		
		colors.set(1, "��");
		colors.set(3, "����");
		colors.set(4, "�׸�");
		
		colors.add(2, "���ο�");
		colors.remove(3);
		colors.remove(3);
		
		System.out.println("���� �� ����: " + colors);
		
	}

}
