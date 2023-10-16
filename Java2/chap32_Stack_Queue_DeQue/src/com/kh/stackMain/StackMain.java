package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// stack �� �� �߰� - push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// stack �� ������ stack.pop();
		// stack �� ��ü ���� stack.clear();
		// stack ���� ����� �� ���(���� �������� ���� ��) stack.peek();
		// stack �� ũ�� ��� stack.size();
		// stack �� ����ִ��� Ȯ�� stack empty(); // ����ִٸ� true �ϳ��� ����ִٸ� false
		// stack�� 1�� �ִ��� Ȯ�� stack.contains(1); // 1�� �����ϸ� true
		
		
		/*
			|     |
			|  3  |
			|  2  |
			|__1__|
		*/
		
		System.out.println(stack.pop()); // 3
		System.out.println(stack.pop()); // 2
	}
}
