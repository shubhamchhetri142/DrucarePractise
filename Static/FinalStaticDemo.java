package com.shubham;
final class Something{// any class as final keyword can't extend it.
	final static int a=10;
	final static String company="Drucare";
	final void method() {//any method as final, it can't be override.
		System.out.println("Value of a is:"+a);
		System.out.println("The name of the comapny is:"+company);
	}
//	class Thing extends Something{//it will show an error at compilation time.
//		
//	}
//	void method() {//can't be override. it will show compilation error.
	//		
//	}
}
public class FinalStaticDemo{
	public static void main(String[] args) {
		Something Static=new Something();
		Static.method();
	}
	
}
