package chap37_ToDoList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TodoListHash {

	Set<String> toDo = new HashSet<>();

	public void addTasck(String task) {
		toDo.add(task);
		
	}

	public Set<String> getTasks() {
		return toDo;
	}

	public void setTasks(Set<String> toDo) {
		this.toDo = toDo;
	}

	public void removetasks(int index) {
		if (index >= 0 && index < toDo.size()) {
			toDo.remove(index);
		} else {
			System.out.println("�߸��� �ε��� �Դϴ�.");
		}
	}
	

	public void displayTasks() {
		System.out.println("My TodoList");
		for(String a : toDo) {
			int i = 1;
			System.out.println(i + ". " + a);
			i++;
		}
	}

	public static void main(String[] args) {

		TodoListHash todoList = new TodoListHash();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("���� �߰��ϱ�: add, �����ϱ� : remove, ���Ϻ��� : list, ���� : exit �Է��ϼ���.");
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���");
				String task = sc.nextLine();
				todoList.addTasck(task);

			} else if (choice.equals("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) - 1;
					todoList.removetasks(index);
				} catch (Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			} else if (choice.equals("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");

	}
}
