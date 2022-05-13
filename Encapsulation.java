package com.oops;


class A{
	private int value;// data hiding
	public void getValue(int x) {//data abstraction
		value=x;
	}
	public int setValue() {
		return value;
	}
}


public class Encapsulation {
	  public static void main(String[] args) {
	    A s=new A();
	    s.getValue(100);
	    System.out.println(s.setValue());
	  }
	}
