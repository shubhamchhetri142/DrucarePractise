package com.collections;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// methods specific
		// first,last, headset, tailset, subset, comparator
		TreeSet nameSet = new TreeSet();
		nameSet.add("Sai");
		nameSet.add("Jaggu");

		nameSet.add("Shiva");
		nameSet.add("Srikanth");
		nameSet.add("Varma");
		nameSet.add("Prashanth");
		nameSet.add("Raju");
		System.out.println(nameSet);
		System.out.println(nameSet.first());
		System.out.println(nameSet.last());
		System.out.println(nameSet.headSet("Sai"));
		System.out.println(nameSet.tailSet("Raju"));
		System.out.println(nameSet.subSet("Prashanth", "Shiva"));
		System.out.println(nameSet.size());
		System.out.println(nameSet.contains("Srikanth"));
		System.out.println(nameSet.containsAll(nameSet));

	}

}
