package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM{

	public void am () {
		// A �����ڸ� classBM ���� ����� �;�!
		AM am = new AM();
		
		publicMethod();
		protectMethod();
		// main �޼��忡�� ���� ȣ���� �ϰų� ������ ���� ȣ��
		// ���� �����ڸ� ������ �־ ���� ��Ű�� ������ ȣ��
		// extends ����ؼ� ȣ���� �Ѵ�
//		defaultMethod(); ���� ��Ű�� �ȿ��� ����� ������ - �ٸ� ��Ű�� �̹Ƿ� ����� �ȵ�
	}
}
