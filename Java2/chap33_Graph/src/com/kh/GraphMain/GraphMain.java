package com.kh.GraphMain;

public class GraphMain {
	public static void main(String[] args) {
		int ver = 7;
		Graph graph = new Graph(ver);
		
		// addEdge ���� �߰�
		graph.addEdge(0, 1); // ��� 0���� ���1�� ������ �ִ� ���� �߰�
		graph.addEdge(0, 2); // ��� 1���� ���2�� ������ �ִ� ���� �߰�
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);

		
		System.out.println("DFS Ž�� ���: " );
		graph.DFS(0); // DFS Ž���� ������ ����� ��ȣ�� ����
		// 0 ���� ����
	}

}

/*
	DFS Ž���� �����Ͽ� �� ����� ���
	Ž�� ����� ���� ��忡�� ����Ͽ�
	���� �켱���� Ž�� �� ��带 �湮�� ������� ���
*/