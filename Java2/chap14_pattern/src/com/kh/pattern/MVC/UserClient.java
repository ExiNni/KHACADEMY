package com.kh.pattern.MVC;

import com.kh.pattern.MVC.Model.UserModel;
import com.kh.pattern.MVC.controller.UserController;
import com.kh.pattern.MVC.view.UserView;

public class UserClient {
	public static void main(String[] args) {
		/*
			MVC ������ ����ؼ� �л� ������ �ٷ�� ��
		*/
		
		// �� ��ü ����
		UserModel user = new UserModel("ȫ�浿", 20);
		
		// �� ��ü ����
		UserView view = new UserView();
		
		// ��Ʈ�ѷ� ��ü �� �� �� �� ����\
		UserController controller = new UserController(user, view);
		
		// �л� ������ ������Ʈ �ؼ� ���
		controller.updateView();
		
		// �л� ���� ������Ʈ
		controller.setUserModel("�̼���");
		controller.setUserAge(30);
		
		// ������Ʈ �� �л� ���� ���
		controller.updateView();

	}

}
