package com.kh.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection run = new PracticeCollection();
		run.Practice1();
		run.Practice2();
		run.practice3();
	}
	
	public void Practice1() {
		List<String> myList = new ArrayList<>();
		// String add �غ��� for �� ����ϱ�
		myList.add("����");
		myList.add("���");
		myList.add("����");
		myList.add("����");
		myList.add("���");
		myList.add("����");
		
		for(String newList : myList) {
			System.out.print(newList + " ");
		}
		System.out.println();
		
	}
	
	public void Practice2() {
		Set<String> myList = new HashSet<>();
		// String add �غ��� for �� ���, �ߺ����� �� add �ؾ���
		myList.add("����");
		myList.add("���");
		myList.add("����");
		myList.add("����");
		myList.add("���");
		myList.add("����");
		
		for(String newList : myList) {
			System.out.print(newList + " ");
		}
		System.out.println();
	}
	
	public void practice3() {
		// Ű�� ���� �̿��ؼ� map put �� ���� ������������ ����ϱ�
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("January", 1);
		myMap.put("February", 2);
		myMap.put("November", 11);
		myMap.put("May", 5);
		
		for(String month : myMap.keySet()) {
			int numMonth = myMap.get(month);
			System.out.println(month + " = " + numMonth);
		}

		
	}

}
