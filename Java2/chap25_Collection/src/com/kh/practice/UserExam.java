package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {
	public static void main(String[] args) {
		// Map <String, Integer>
		// �̸�, ����
		// contains

		Map<String, Integer> user = new HashMap<>();
		user.put("�̼���", 25);
		user.put("������", 24);
		user.put("������", 23);
		user.put("ȫ�浿", 22);

		String userName = "�̼���";

		if (user.containsKey("�̼���")) {
			int age = user.get(userName);
			System.out.println(userName + "�� ���� : " + age);
		} else {
			System.out.println(userName + "�� ���̸� ã�� �� �����ϴ�.");
		}
	}

}
