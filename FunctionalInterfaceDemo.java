package com.java8;

@FunctionalInterface
interface interf {
	public int product(int n);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		interf i = n -> n * n;
		System.out.println(i.product(10));

	}

}
