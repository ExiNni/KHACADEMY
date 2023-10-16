package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {

		// HashMap ���� UserAge
		Map<String, Integer> user = new HashMap<>();
		// ������ �̸��� ����
		user.put("�̼���", 20);
		user.put("������", 21);
		user.put("ȫ�浿", 22);
		user.put("����", 23);

		// Ư�� ���� �˻�
		String searchName = "ȫ�浿";
		if(user.containsKey(searchName)) {
			int age = user.get(searchName);
			System.out.println("���� �̸�: " + searchName + " ���� : " + age);
		} else {
			System.out.println(searchName + " ������ ã�� �� �����ϴ�.");
		}
		// ��� �̸��� ���� ���
		for(Map.Entry<String, Integer> entry : user.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		// ���� ���� ����
		String userUpdate = "ȫ�浿";
		int newAge = 30;
		user.put(userUpdate, newAge);
		System.out.println(userUpdate + "�� ���̸� " + newAge + "�� �����߽��ϴ�.");
		// ���� Ż��
		String removeUser = "������";
		user.remove(removeUser);
		System.out.println(removeUser + "�� ������ �����߽��ϴ�.");

		//���� ���� �̸� ���� ���
		System.out.println("��� ���� ���� : ");
		for (Map.Entry<String, Integer> entry : user.entrySet()) {
			System.out.print(entry + " ");
		}

	}

}
