package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {

		ArrayList<String> toDo = new ArrayList<>();
		
		toDo.add("�� ����");
		toDo.add("�����ϱ�");
		toDo.add("�ı�");
		System.out.println(toDo);
		
		int size = toDo.size();
		System.out.println("�� ���� : " + size);
		
		toDo.remove(1);
		System.out.println("���� üũ : " + toDo);
		
		toDo.add("���ڱ�");
		System.out.println("�� �� : " + toDo);

	}

}
