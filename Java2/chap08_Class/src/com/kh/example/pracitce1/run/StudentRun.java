package com.kh.example.pracitce1.run;

import com.kh.example.pracitce1.model.vo.Student;

public class StudentRun {
	public static void main(String[] args) {

		Student myStudent1 = new Student(3, 5, "ȫ�浿", 180.55, '��');
		Student myStudent2 = new Student(2, 4, "������", 160.82, '��');
		Student myStudent3 = new Student(1, 6, "�̼���", 172.39, '��');

		myStudent1.information();
		myStudent2.information();
		myStudent3.information();

	}

}
