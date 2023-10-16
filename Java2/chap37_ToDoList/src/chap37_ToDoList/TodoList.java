package chap37_ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	private ArrayList<String> tasks;
	public TodoList() {
		tasks = new ArrayList<>();
		
	}
	
	public void addTack(String task) {
		tasks.add(task);
	}
	
	public ArrayList<String> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<String> tasks) {
		this.tasks = tasks;
	}

	public void removetasks(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("�߸��� �ε��� �Դϴ�.");
		}
	}
	
	public void displayTasks() {
		System.out.println("My TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + " . " + tasks.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰� : add, ���� : remove, ���Ϻ��� : list, ���� : exit �Է��ϼ���.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���");
				String task = sc.nextLine();
				todoList.addTack(task);
				
			} else if(choice.equals("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removetasks(index);
				} catch(Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			} else if(choice.equals("list")) {
				todoList.displayTasks();
			} else if(choice.equals("exit")){
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		
	}
}
