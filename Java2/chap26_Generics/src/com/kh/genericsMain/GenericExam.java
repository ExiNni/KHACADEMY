package com.kh.genericsMain;

public class GenericExam {
	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(1);
		int intValue = intBook.get(); // �� ��ȯ�� �ʿ����� ����
		
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("gggg");
		strBook.put("Java");
		strBook.put("Python");
		strBook.put("C++");
		String strValue = strBook.get();
		
		
		// ���ʸ� Ŭ������ ����ؼ� �پ��� ������ ������ ó���� �� �ְ� ����� �� ����
		System.out.println("Int value: " + intValue);
		System.out.println("String value : " + strValue);
		
		
		
	}

}
