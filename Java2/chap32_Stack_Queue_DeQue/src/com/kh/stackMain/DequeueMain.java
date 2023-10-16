package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		
		
		/*
					      ����                           ��
					       |                            |
						   V                            V
						[first] < - > [second] < - > [third]
			
					^                                            ^
					|                                            |
				 [     ]                                      [     ]
		*/
		
		// ArrayDequeue ����Ͽ� Dequeue ����
		Deque <String> str = new ArrayDeque<>();
		
		// ��� �߰�
		str.addFirst("First");
		str.addLast("Last");
		
		// �� �հ� �� �� ��� Ȯ��
		System.out.println(str.getFirst());
		System.out.println(str.getLast());
		
		// �� �հ� �� �� ��� ����
		str.removeFirst();
		str.removeLast();
		System.out.println(str);
		
		// ����ִ��� Ȯ��
		System.out.println(str.isEmpty());
	}

}
