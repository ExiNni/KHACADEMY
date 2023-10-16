package chap29_randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
	Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
	���� : �������� ������� ��
*/
public class RandomMain {

	public static void main(String[] args) {
		RandomMain run = new RandomMain();
		run.Lotto();
	}
	
	public void Lotto() {
		Random rd = new Random(); // ���� ��ü ����
		// 1 ~ 45 ���� �����ؼ� ���� ����
		// ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>(); 
		// �ߺ��� ���ϱ� ���� set�� ��� �� �� ����
		// ���� 6���� �� ��
		while(lottoNum.size() < 6) {
			int ranNum = rd.nextInt(45) + 1; // 0 ~ 44  �ڸ��� �������� ��ȣ �ϳ�
			
			// �����ϴ��� ���� Ȯ��, �ߺ� X
			if(!lottoNum.contains(ranNum)) {
				lottoNum.add(ranNum);

			}
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
	}

	public void RandomExam() {
		// �ζ� ��ȣ ������
		Random rd = new Random(); // ���� ��ü ����

		// 1. ���� ���� ������ ������ ������ ������ ��
		int ranInt = rd.nextInt(100); // 0 ~ 99 ���̿��� ���� �ϳ� �߻�
		System.out.println(ranInt);

		// 2. �Ǽ� ���� ������ ������ ������ ������ ��
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0

	}
}
