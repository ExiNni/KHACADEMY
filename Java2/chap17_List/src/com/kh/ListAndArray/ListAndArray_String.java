package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray_String {
	public static void main(String[] args) {
		// Array ����
		String[] StringArray = new String[2]; // ũ�Ⱑ 5�� ���� �迭 ����
		StringArray[0] = "ȫ�浿";
		StringArray[1] = "�̼���";
		
		// Array ���
		System.out.println("Array ��� : ");
		for(int a = 0; a < StringArray.length; a++) {
			System.out.println(StringArray[a] + " ");
		}
		
		System.out.println(); // ���๮�� ���ԵǾ� �־� enter���� ������ ��
	
		// List ����
		List<String> StringList = new ArrayList<>();
		StringList.add("ȫ�浿");
		StringList.add("�̼���");
		StringList.add("������");
		
		// List ���
		System.out.println("List ���: ");
		for(String num : StringList) {
			System.out.println(num + " ");
		}
	}

}
