package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
	SimpleDateFormat
		��¥�� �ð��� ���ϴ� ��������  ������ �ϰų�
		���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
*/
public class SimpledateFormat {

	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String forDate = sdf.format(currentDate);
		
		// ��� ���
		System.out.println("������ �� ��¥ �� �ð�: " + forDate);
	}
}
