package com.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet placeSet = new TreeSet();

		placeSet.add("Gachibowli");
		placeSet.add("Hi-tech City");
		placeSet.add("Madhapur");
		placeSet.add("Financial District");
		placeSet.add("Kondapur");
		// placeSet.add(10);
		// placeSet.add(null);
		System.out.println(placeSet);
		System.out.println(placeSet.size());
		System.out.println(placeSet.first());
		System.out.println(placeSet.last());
		System.out.println(placeSet.subSet("Gachibowli", "Kondapur"));
		System.out.println(placeSet.isEmpty());
		System.out.println(placeSet.remove("Kondapur"));
	}
}
