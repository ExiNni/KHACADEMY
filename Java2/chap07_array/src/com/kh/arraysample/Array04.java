package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		
		String [] inturnArray = {"ȫ�浿", "��ö��" , "�踻��", "��ö��", "������"};
		
		inturnArray [3] = "���ѳ�";
		
		System.out.println("��ö�� �� ��ſ� " + inturnArray[3] );
		
		String[] fruitArray = {"���", "����", "Ű��", "�޷�", "��"};
		fruitArray[0] = "�ٳ���";
		fruitArray[1] = "����";
		fruitArray[2] = "����";
		fruitArray[3] = "��";
		fruitArray[4] = "������";
		
		for(int i = 0; i < fruitArray.length; i++) {
			System.out.println(fruitArray[i]);

		}
		
		
	}
}
