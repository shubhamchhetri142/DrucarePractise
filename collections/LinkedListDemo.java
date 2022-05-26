package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList addressList = new LinkedList();
		addressList.add("Kukatpally");
		addressList.add("Balanagar");
		addressList.add("Moosapet");
		addressList.add("KPHB");
		addressList.add("uppal");
		addressList.set(0, "Tank Band");
		addressList.add(0, "Miyapur");

		System.out.println(addressList);
		System.out.println(addressList.getFirst());
		System.out.println(addressList.getLast());
		System.out.println(addressList.removeFirst());
		System.out.println(addressList.isEmpty());
		System.out.println(addressList.containsAll(addressList));
		System.out.println(addressList.equals(addressList));
		System.out.println(addressList);

	}
}
