package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("ȫ�浿");
		name.add("������");
		name.add("�̼���");
		name.add("ȫ����");
		
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext()) {
			String nm = itr.next();
			System.out.println(nm);
		}
		System.out.println();

		itr = name.iterator();
		while(itr.hasNext()) {
			String nm = itr.next();
			if(nm.equals("ȫ�浿")) {
				itr.remove();
			}
			
			System.out.println(nm);
		}
		
		System.out.println();
		System.out.println("���� ��:");
		for(String a : name) {
			System.out.println(a);
		}
	}

}
