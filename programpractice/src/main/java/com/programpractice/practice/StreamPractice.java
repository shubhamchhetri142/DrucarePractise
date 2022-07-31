package com.programpractice.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 98, 15, 15, 32);
		Set<Integer> set = new HashSet<Integer>();
		String input = "Hi Welcome to Drucare Pvt Ltd";
		
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		myList.stream().map(m -> m + "").filter(m -> m.startsWith("1")).forEach(System.out::println);
		
		myList.stream().filter(f -> !set.add(f)).forEach(System.out::println);
		
		myList.stream().findFirst().ifPresent(System.out::println);
		
		Long count = myList.stream().count();
		System.out.println(count);

		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
		
		myList.stream().sorted().forEach(System.out::println);

		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		Character result = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
				// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
				// the
				// chars
				// in
				// map
				// with
				// count
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);

		Character results = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
				// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
				// the
				// chars
				// in
				// map
				// with
				// count
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(results);
	}
}
