
import java.util.ArrayList; // ��̸���Ʈ ��� ���� import ��

interface Observer { // Observer �������̽� ����
	public void update(String msg);
}
class SooOb2 implements Observer { // SooOb2 Ŭ���� ����
	public void update(String msg) { // update �޼ҵ� ����
		System.out.println("Soojebi Observer2:" + msg); // msg ���
	}
}

class SooOb1 implements Observer { // SooOb1 Ŭ���� ����
	public void update(String msg) { // update �޼ҵ� ����
		System.out.println("Soojebi Observer1:" + msg); // msg ���
	}
}


interface Subject { // Subject �������̽� ����
	public void register(Observer o); // ������ ���(register) �޼���

	public void remove(Observer o); // ������ ����(remove) �޼���

	public void notify(String msg); // ������ �˸�(notify) �޼���
}

class SoojebiData implements Subject { // SoojebiData Ŭ����
	private ArrayList<Observer> observers; // ������ ����

	public SoojebiData() {
		observers = new ArrayList<Observer>(); // ������ ��ü ����
	}

	public void register(Observer o) { // ������ ��� ����
		observers.add(o); // ����Ʈ add
	}

	public void remove(Observer o) { // ������ ���� ����
		observers.remove(o); // ����Ʈ remove
	}

	public void notify(String msg) { // ������ �˸� ����
		for (Observer o : observers) { // ��� ������ msg �����Ͽ� ������Ʈ
			o.update(msg);
		}
	}
}

class Soojebi {
	public static void main(String[] args) {
		SoojebiData sd = new SoojebiData(); // SoojebiData Ŭ������ ��ü sd ���� �� ����
		Observer o1 = new SooOb1(); // ������ o1 ��ü ���� �� ����
		Observer o2 = new SooOb2(); // ������ o2 ���� �� ����

		sd.register(o1); // o1 ���
		sd.register(o2); // o2 ���
		sd.remove(o1); // o1 ����
		sd.notify("notify msg"); // msg �� �������� ����
		sd.remove(o2); // o2 ����
	}
}
