package com.kh.pattern.MVC;

import com.kh.pattern.MVC.Model.StudentModel;
import com.kh.pattern.MVC.controller.StudentController;
import com.kh.pattern.MVC.view.StudentView;

public class StudentClient {
	/*
		MVC ������ ����ؼ� �л������� �ٷ�� ��
	*/
	public static void main(String[] args) {
		// �� ��ü ���� Model
		StudentModel stdmodel = new StudentModel("���л�", 17);
		// �� ��ü ���� View
		StudentView stdView = new StudentView();
		// ��Ʈ�ѷ� ��ü ���� Controller (�� �� ����)
		StudentController cntl = new StudentController(stdmodel, stdView);
		// �л� ������ ������Ʈ �ؼ� ���
		cntl.updateView();
		// �л� ���� ������Ʈ�� ����!
		cntl.setstudentName("�̾�����Ʈ");
		cntl.setstudentAge(18);
		// ������Ʈ �� �л� ������ ���
		cntl.updateView();
	}

}
