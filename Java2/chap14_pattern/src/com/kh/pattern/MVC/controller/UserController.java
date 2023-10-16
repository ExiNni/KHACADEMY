package com.kh.pattern.MVC.controller;

import com.kh.pattern.MVC.Model.UserModel;
import com.kh.pattern.MVC.view.UserView;

public class UserController {

	/*
	 * �𵨰� �並 �����ϴ� �� ����� �Է��� ó���ϴ� ��
	 */

	private UserModel usermodel;
	private UserView userview;

	public void setUserModel(String name) {
		//this.usermodel = usermodel;
		usermodel.setName(name);
	}

	public String getUserName() {
		return usermodel.getName();
	}
	
	public void setUserAge(int Age) {
		usermodel.setAge(Age);

	}
	
	public int getUserAge() {
		return usermodel.getAge();
	}
	
	public void setView(UserView view) {
		this.userview = view;
	}

	public UserModel getModel() {
		return usermodel;
	}

	public UserView getView() {
		return userview;
	}

	public UserController(UserModel model, UserView view) {
		this.usermodel = model;
		this.userview = view;
	}
	
	public void updateView() {
		userview.displayInfo(usermodel.getName(), usermodel.getAge());
	}
}
