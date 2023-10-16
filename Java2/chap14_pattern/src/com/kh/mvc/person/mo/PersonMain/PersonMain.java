package com.kh.mvc.person.mo.PersonMain;

import com.kh.mvc.person.mo.PersonController.PersonController;
import com.kh.mvc.person.mo.PersonModel.PersonModel;
import com.kh.mvc.person.mo.PersonView.PersonView;

public class PersonMain {

	public static void main(String[] args) {

		PersonModel pm = new PersonModel("���л�", 17);
		// �� ��ü ���� View
		PersonView pv = new PersonView();
		// ��Ʈ�ѷ� ��ü ���� Controller (�� �� ����)
		PersonController pc = new PersonController(pm, pv);
		// �л� ������ ������Ʈ �ؼ� ���
		pc.updateView();
		// �л� ���� ������Ʈ�� ����!
		pc.setpersonName("��浿");
		pc.setpersonAge(25);
		// ������Ʈ �� �л� ������ ���
		pc.updateView();
	}

}


