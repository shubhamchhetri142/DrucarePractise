package com.java8.Consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> addition = (a, b) -> System.out.println("Addtion of two Numbers:" + (a + b));
		addition.accept(5, 10);
		BiConsumer<String, String> name = (a, b) -> System.out.println("Nmae of the Person:" + (a + b));
		name.accept("Shubham", " Chhetri");
	}

}
