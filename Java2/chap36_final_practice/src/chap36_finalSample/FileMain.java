package chap36_finalSample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileMain {

	public static void main(String[] args) {
		FileMain run = new FileMain();
		Food foodSample = new Food("���", 20);
		run.fileSave("food.txt", foodSample);
	}

	public void fileSave(String filename, Food food) {
		// ���� ���� fileName���� ���� ��ü ����
		try {
			FileOutputStream fOStream = new FileOutputStream(filename);
			// ���� ��ü�� �����ϴ� ���� ��� ��Ʈ�� ����
			ObjectOutputStream objStream = new ObjectOutputStream(fOStream);

			// ���Ͽ� food ��ü�� ���
			objStream.writeObject(food);

			// ��Ʈ���� ����
			objStream.close();
			fOStream.close();

			System.out.println("Food ��ü�� ���Ͽ� �����߽��ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}