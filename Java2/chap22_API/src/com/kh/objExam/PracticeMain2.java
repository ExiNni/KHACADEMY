package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 run = new PracticeMain2();
		run.practice1();
		run.practice2();
		run.practice3();
		run.practice4();
		run.practice5();

	}

	public void practice1() {

		StringBuffer sb = new StringBuffer();
		sb.append("���� ");
		sb.append("������ ");
		sb.append("������?");
		System.out.println(sb);

	}

	public void practice2() {
		String str = "���� ������ ������?";
		StringBuffer sb = new StringBuffer();
		sb.append(str.toString());
		sb.reverse();
		System.out.println(sb);

	}

	public void practice3() {
		String str = "���� ������ ������?";
		StringBuffer sb = new StringBuffer();
		sb.append(str.toString());
		sb.insert(11, "!");
		System.out.println(sb);

	}

	public void practice4() {
		String str = "���� ������ ������?";
		StringBuffer sb = new StringBuffer();
		sb.append(str.toString());
		sb.replace(7, 11, "����");
		System.out.println(sb);
	}

	public void practice5() {
		String str = "���� ������ ������?";
		StringBuffer sb = new StringBuffer();
		sb.append(str.toString());
		sb.delete(3, 7);
		System.out.println(sb);
	}

}
