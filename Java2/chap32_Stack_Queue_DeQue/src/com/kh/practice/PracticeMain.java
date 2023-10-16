package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ���
	public static void main(String[] args) {
		PracticeMain run = new PracticeMain();
		run.Practice2();
		
	}
	public void Practice1() {
		Stack<String> str = new Stack<>();
		str.push("ȫ�浿");
		str.push("������");
		str.push("�̼���");
		str.push("���߱�");
		str.push("ȫ����");
		
		System.out.print(str);
		System.out.println();
		System.out.println(str.pop());
		
		str.clear();
		System.out.println(str);
		
		str.push("���");
		str.push("�ٳ���");
		str.push("����");
		str.push("����");
		str.push("������");
		System.out.print(str);
		System.out.println();
		
		System.out.println(str.size());
		System.out.println(str.contains("����"));
		
	}
	
	public void Practice2() {
		Queue<String> str = new LinkedList<>();
		
		str.offer("���");
		str.offer("����");
		str.offer("������");
		str.offer("����");
		str.offer("���");
		str.offer("ü��");
		str.offer("�ٳ���");
		
		System.out.print(str);
		System.out.println();
		
		str.poll();
		System.out.print("poll : " + str);
		System.out.println();
		
		System.out.println("str peek : " + str.peek());
		
		System.out.println("str size : " + str.size());
		
		while(!str.isEmpty()) {
			String element = str.poll();
			System.out.print(element);
		}
	}
}
