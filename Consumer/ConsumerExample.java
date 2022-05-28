package com.java8.Consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c1 = s -> System.out.println(s.length());
		c1.accept("Sing a song");

		Consumer<String> c2 = (s1) -> System.out.println(s1.toUpperCase());
		c2.accept("hyderabad");

		c1.andThen(c2).accept("Come to the party");

		Consumer<Integer> c3 = (s) -> System.out.println(s + 5);

		Consumer<Integer> c4 = (s) -> System.out.println(s * 10);

		c3.andThen(c4).accept(5);

	}

}