package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat =  new Cat("�߿���");
		myCat.info();
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("����");
		myMonkey.info();
		myMonkey.eat();
		
		Lion myLion = new Lion("King");
		myLion.info();
		myLion.eat();
		myLion.sleep();
	}

}
