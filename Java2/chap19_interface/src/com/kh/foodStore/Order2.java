package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

public class Order2 implements FoodStore{
private List<Menu> OrderMenus;
	
	public Order2() {
		OrderMenus = new ArrayList<>();
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("�ֹ� ����: ");
		for(Menu menuA : OrderMenus) {
			System.out.println(menuA.getItem());

		}
	}
}
