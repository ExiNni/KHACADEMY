package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
	/*
		Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
			   java1.1 ���� ������� ����
			   	java.time ��Ű������ LocalDate Ȥ�� LocalTime LocalDateTime
	*/
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("���� ��¥ �ð�: "+ current);
		
		// ��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate future = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + future);
		
		// minus plus �̿��ؼ� �� 2���� ������ �� 4��
		LocalDate past1 = today.minusDays(100);
		System.out.println("100���� ��¥ : " + past1);
		LocalDate future1 = today.plusDays(100);
		System.out.println("100�� �� ��¥ : " + future1);
		LocalDate past2 = today.minusDays(200);
		System.out.println("200���� ��¥ : " + past2);
		LocalDate future2 = today.plusDays(200);
		System.out.println("200�� �� ��¥ : " + future2);
		
		LocalDate date1 = LocalDate.of(2023, 8, 13);
		LocalDate date2 = LocalDate.of(2022, 9, 13);
		
		if(date1.isBefore(date2)) {
			System.out.println("�� �����Դϴ�");
		}else if(date1.isAfter(date2)){
			System.out.println("�� ���� �Դϴ�.");
		
		}else {
			System.out.println("��¥�� �����ϴ�.");
		}
				
	}
}
