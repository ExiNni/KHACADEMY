package junk;

import java.util.HashMap;
import java.util.Map;

public class mapPractice {

	public static void main(String[] args) {

		Map<String, Integer> user = new HashMap<>()
				;
		user.put("ȫ�浿", 10);
		user.put("������", 11);
		user.put("������", 12);
		user.put("����", 13);
		user.put("�̼���", 14); 
		
		String searchName = "ȫ�浿";
		
		if(user.containsKey(searchName)) {
			int age = user.get(searchName);
			System.out.println("���� �̸�: " + searchName + " ���� : " + age);
			
		} else {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
		for(Map.Entry<String, Integer> entry : user.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}

	}
	

}
