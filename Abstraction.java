package com.oops;

abstract class Animal{
	public  abstract void sound();
}
class Dog extends Animal{
	 public void sound() {
		System.out.println("Dog is Barking.");
	}
}
class Lion extends Animal{
	public void sound() {
		System.out.println("Lion is Roar.");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Dog d=new Dog();
		Lion l=new Lion();
		l.sound();
		d.sound();

	}

}
