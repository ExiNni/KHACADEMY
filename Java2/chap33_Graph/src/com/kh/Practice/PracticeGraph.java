package com.kh.Practice;

import com.kh.BFS.Graph;

public class PracticeGraph {
	public static void main(String[] args) {
		int ver = 7; // �׷��� ���� ���� 5�� ����
		PracticeGraph ph = new PracticeGraph();
		ph.BFSPracticeMain();
	}

	public void BFSPracticeMain() {
		Graph g = new Graph(6);
		// ���� �߰�
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);

		System.out.println("BFS Ž�� ��� : ");
		g.BFS(0);
	}

	public void DFSPracitceMain() {
		Graph g = new Graph(6);
		
		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(4, 5);
		
		g.addEdge(2, 5);
		g.addEdge(2, 6);

		
		System.out.println("DFS Ž�� ���: " );
	}
}

/*
 * DFS Ž���� �����Ͽ� �� ����� ��� Ž�� ����� ���� ��忡�� ����Ͽ� ���� �켱���� Ž�� �� ��带 �湮�� ������� ���
 */