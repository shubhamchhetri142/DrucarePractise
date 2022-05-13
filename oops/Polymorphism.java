package com.oops;

public class Polymorphism {
	void add() {
		int a=10,b=20;
		int c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x,double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Polymorphism s1=new Polymorphism();
		s1.add();
		s1.add(100,200);
		s1.add(25,25.00);
	}

}
