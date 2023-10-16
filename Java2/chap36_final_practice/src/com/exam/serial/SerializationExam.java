package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) {
		PersonSerial p = new PersonSerial("KH", 30);

		try {
			FileOutputStream fileout = new FileOutputStream("person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(p);
			out.close();
			fileout.close();
			System.out.println("Person ��ü�� ����ȭ �Ǿ� person.txt");
		} catch (Exception e) {

		}
		// ���Ͽ��� ��ü�� ������ȭ �Ͽ� �о��
		try {
			FileInputStream fileIn = new FileInputStream("person.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			PersonSerial deSerialPerson = (PersonSerial) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("person.txt ���Ͽ��� ��ü�� ������ȭ �Ͽ����ϴ�");
			System.out.println("������ȭ�� ��ü ����: " + deSerialPerson);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
