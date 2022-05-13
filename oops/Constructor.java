package com.oops;
class Add{
	int a;
	int b;
	int sum;

	Add(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Sum of a and b is:");
	}
}
public class Constructor {

	public static void main(String[] args) {
		Add a=new Add(10,20);
		System.out.println(a.a+"+"+a.b+"="+(a.a + a.b));

	}

}
