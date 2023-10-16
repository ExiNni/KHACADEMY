package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	public static void main(String[] args) {
		// Array ����
		int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 ����
		intArray[0] = 1;
		intArray[1] = 2;
		
		// Array ���
		System.out.println("Array ��� : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
		
		System.out.println(); // ���๮�� ���ԵǾ� �־� enter���� ������ ��
	
		// List ����
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		// List ���
		System.out.println("List ���: ");
		for(int num : intList) {
			System.out.println(num + " ");
		}
	}

}
