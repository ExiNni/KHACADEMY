package com.kh.treeMain;

public class TreeNode {
	/*
	 * ��带 ��Ÿ���� �� ������ Ŭ����
	 */
	int data; // ������ ����
	TreeNode left; // ���� �ڽ� ��带 �����ϴ� ��ũ
	TreeNode right; // ������ �ڽ� ��带 �����ϴ� ��ũ
	
	// ��带 ������ �� �����͸� �ʱ�ȭ�ϰ� ���ʰ� ������ ��ũ�� null�� �ʱ�ȭ
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
}
