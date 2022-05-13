package com.oops;
class Add{
	int a;
	int b;
	int sum;

	Add() {
		a=10;
		b=20;
		System.out.println("Sum of a and b is:");
	}
}
public class Constructor {

	public static void main(String[] args) {
		Add a=new Add();
		System.out.println(a.a+"+"+a.b+"="+(a.a + a.b));

	}

}
