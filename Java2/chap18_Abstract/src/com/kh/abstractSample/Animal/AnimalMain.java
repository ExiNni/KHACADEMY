package com.kh.abstractSample.Animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("�ٵ���");
		System.out.println("������ �̸�: " + myDog.getAnimal());
		System.out.println("������ �����Ҹ�: " + myDog.animalSound());
		
		Cat myCat = new Cat("����");
		System.out.println("����� �̸�: " + myCat.getAnimal());
		System.out.println("����� �����Ҹ�: " + myCat.animalSound());		
		
		Animal[] animal = new Animal[2];

		animal[0] = new Cat("�ǻ�");
		animal[1] = new Cat("�ƹ���");
		System.out.println("����� �̸�: " + animal[0].getAnimal());
		System.out.println("����� �����Ҹ�: " + animal[0].animalSound());		
		System.out.println("����� �̸�: " + animal[1].getAnimal());
		System.out.println("����� �����Ҹ�: " + animal[1].animalSound());		
		
		/*
		 * for(Animal a : animal){
		 * a.displayName();
		 * a.makesound();
		 * sysout;
		 * }
		 *
		 */
		
	}
	
	/*	public static void main(String[] args) {
	Dog myDog = new Dog("�ٵ���", "��");
	System.out.println("������ �̸�: " + myDog.getAnimal());
	System.out.println("������ �����Ҹ�: " + myDog.animalSound());
}
*/

}
