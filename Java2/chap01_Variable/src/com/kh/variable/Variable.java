package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1. ������ �̸��� �����ڿ�, ����, ������ھ�, �޷��� ������ �� �ִ�.
		// 2. ������ �̸��� ���ڷ� ������ �� ����.
		// 3. ���� �̸� ���̿��� ������ ������ �� ����.
		// ����� ��Ģ���� ����� ���� ���� ������ �� ����ϱ� ������ ������� �ʴ´�.
		// 4. �ڹٿ��� �̸� ������ ���� �̸����� ������� ���Ѵ�.
		
		//�Ǽ��� (float, double)
		float pie1 = 3.1411231242f; // float�� �ڿ� f�� �빮�� F�� �ۼ����ش�.
		double pie2 = 3.1411231242;
		System.out.println("float : " + pie1);
		System.out.println("double : " + pie2);
		
		// byte : ����Ʈ�� -128 ~ 127���� ��밡��
		// byte bt = -129; // int �� �����ϰų� ���� ����� �־������ - byte + byte
		byte bt = 127; // -129 �� 128 �̻���� ����� ���� �ʴ� �� Ȯ��
		System.out.println(bt);
		
		// short = -32,768 ~ 32,767 ���� ��밡��
		// short shrt = -32769; // -32,769�� 32,768 �̻��� ��µ��� ����
		short shrt = -32767;
		System.out.println(shrt);
		
		// int = -2,147,483,648 ~ 2,147,483,647 ���� ��� ����
		int nt = -2147483648;
		System.out.println(nt);
		
		// long = -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long lng = 20000L; // �ڿ� �빮�� L �̳� �ҹ��� l�� �����ش�.
		System.out.println(lng);
		
		// char : ������ ���ڸ� �ѱ��ڸ� ������ �� ����
		// ''; �� ��� ����
		char chr1 = 'a';
		System.out.println(chr1);
		
		// String�� �⺻���� �ڷ����� ������ ������ �⺻������ ����.
		// �⺻���� �ڷ����� ���� �ʱ� ������ String ���� ǥ����.
		// String ""�̳� '' �ȿ� ���ڷ� �ۼ��� ��
		String name = "�ȳ��ϼ���";
		System.out.println(name);
		
		// boolean�� true �� false�� ǥ���Ѵ�.
		// �����: boolean bln = true; | false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("�ȳ��ϼ���. ���� ȫ�浿 �Դϴ�.");
		String name1 = "ȫ�浿";
		System.out.println("�ȳ��ϼ���. ���� " + name1 + " �Դϴ�.");
		// �� �� Ÿ���� ������ ������ �缱���� ���� �ʰ� �״�� ����ص� �ȴ�.
		// �� �� Ÿ���� ������ Ÿ���� ���� Ÿ������ �缱�� �� �� ����.
		// ������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ������ �� ����.
		name1 = "��ö��";
		System.out.println("�ȳ��ϼ���. ���� " + name1 + " �Դϴ�.");
		
		int age = 22;
		String baseball = "�߱�";
		System.out.println("�ȳ��ϼ���. ���� " + name1 + " �Դϴ�.");
		System.out.println("���� ���̴� " + age + "�� �̰�,");	
		System.out.println("���� ��̴� " + baseball + "�Դϴ�.");
		
		char score = 'a';
		System.out.println("���� ������ " + score + "�Դϴ�");
	}
}
