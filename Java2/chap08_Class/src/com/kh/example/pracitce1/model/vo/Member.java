package com.kh.example.pracitce1.model.vo;

import java.util.Scanner;

public class Member {

	Scanner sc = new Scanner(System.in);
	String memberID, memberPwd, memberName, phone, email, newName;
	int age;
	char gender;
	
	public Member(String memberID, String memberPwd, String memberName, int age, char gender, String phone, String email) {
	this.memberID = memberID;
	this.memberPwd = memberPwd;
	this.memberName = memberName;
	this.age = age;
	this.gender = gender;
	this.phone = phone;
	this.email = email;
	
	
			
	}
	
	public void changeName(String newName) {
		this.newName = newName;
		
	}
	public void printName() {
		System.out.println("���� �� �̸�: " + memberName + "/ ���� �� �̸�: " + newName);
		System.out.println("��� ���̵�: " + memberID);
		System.out.println("��� ��й�ȣ: " + memberPwd);
		System.out.println("��� ����: " + age);
		System.out.println("��� ����: " + gender);
		System.out.println("��� ��ȭ��ȣ " + phone);
		System.out.println("��� �̸���: " + email);
	}
	

}
