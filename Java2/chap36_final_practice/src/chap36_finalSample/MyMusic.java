package chap36_finalSample;

import java.util.ArrayList;

public class MyMusic {
	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("�߶��", "����"));
		list.add(new Music("��", "�ų�"));
		// list.add(new Music("����", "����"));
		
		for(int i = 0; i < list.size(); i ++) {
			Music m = list.get(i);
			System.out.println(m.getName() + ", " + m.getEmotion());
		}

	}
	public static void main(String[] args) {
		MyMusic run = new MyMusic();
		run.runFruit();
	}
}
