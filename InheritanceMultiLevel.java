package com.oops;

import java.util.Scanner;

class Super1{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c;
	void Add(){
		System.out.println("Enter the a value:"+a);
		System.out.println("Enter the b value:"+b);
		System.out.println("Sum of two numbers is:"+(c=a+b));
	}
	void Sub() {
		System.out.println("Enter the a value:"+a);
		System.out.println("Enter the b value:"+b);
		System.out.println("Sub of two numbers is:"+(c=a-b));
	}
}
class B extends Super1{
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	int b=sc.nextInt();
	int c;
	void Mul() {
		System.out.println("Enter the a value:"+a);
		System.out.println("Enter the b value:"+b);
		System.out.println("Mul of two numbers is:"+(c=a*b));
	}
	void Div() {
		System.out.println("Enter the a value:"+a);
		System.out.println("Enter the b value:"+b);
		System.out.println("Div of two numbers is:"+(c=a/b));
	}
}
class C extends B{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c;
	void Rem() {
		System.out.println("Enter the a value:"+a);
		System.out.println("Enter the b value:"+b);
		System.out.println("Rem of two numbers is:"+(c=a%b));
	}
}
class InheritanceMultiLevel{
	public static void main(String[] args) {
		C obj=new C();
		obj.Add();
		obj.Sub();
		obj.Mul();
		obj.Div();
		obj.Rem();
	}
}
