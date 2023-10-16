package chap28_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String>{
	
	@Override
	public int compare(String num1, String num2) {
		// ���̰� ������ 0 ��ȯ
		if(num1.length() == num2.length()) {
			return 0;
		} else if( num1.length() > num2.length()) {		// num1�� num2 ���� ��� ��� ��ȯ
			return 1;
		} else {
			return -1; // num1 �� num2 ���� ª���� ����
		}

		
	}
	public static void main(String[] args) {
		List <String> str = new ArrayList<>();
		str.add("Apple");
		str.add("Banana");
		str.add("Cherry");
		str.add("Add");
		str.add("Abcdefg");
		str.add("Day");
		str.add("Z");

		// Comparator�� ����ؼ� ���ڿ��� ����
		// 1. ����, 2. ����
		Collections.sort(str, new ComparatorMain());
		
		// ���ĵ� ��� ���
		for(String s : str) {
			System.out.println(s);
		}
	}
}
