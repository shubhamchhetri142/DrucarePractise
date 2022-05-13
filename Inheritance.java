package com.oops;

class Student{
	String name;
	String address;
	int roll;
	void m(){
		System.out.println("Enter the name address and roll:");
	}
}

class Inheritance extends Student{
	void m1(){
		name="Drucare"; address="Gachibowli";roll=7;
		System.out.println(name+" "+address+" "+roll);
	}

	public static void main(String[] args) {
		Inheritance s=new Inheritance();
		s.m();s.m1();
	}

}
