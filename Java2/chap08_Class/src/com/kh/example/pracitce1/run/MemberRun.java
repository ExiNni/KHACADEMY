package com.kh.example.pracitce1.run;

import com.kh.example.pracitce1.model.vo.Member;

public class MemberRun {

public static void main(String[] args) {
		
		Member newMember = new Member("ExiNni", "123456", "ȫ�浿", 25, '��', "010-1234-5678", "hong@google.com");
		
		newMember.changeName("�̼���");
		newMember.printName();
		

		
	}

}