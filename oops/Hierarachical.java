package com.oops;

class SuperA {
	void input() {
		System.out.println("Enter you're name:");
	}
}
class SubB extends SuperA{
	void show() {
		System.out.println("My name is Shubham");
	}
}
class SubC extends SuperA{
	void display() {
		System.out.println("My name is Chhetri");
	}
}
public class Hierarachical {

	public static void main(String[] args) {
		SubB s=new SubB();
		SubC s1=new SubC();
		s.input();s.show();
		s1.input();s1.display();

	}

}
