package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet snacksSet = new HashSet();
		snacksSet.add("lays");
		snacksSet.add("icecream");
		snacksSet.add("biscuit");
		snacksSet.add("aloo Bajji");
		snacksSet.add(null);
		snacksSet.add("biscuit");
		snacksSet.add(100);
		snacksSet.add(null);
		System.out.println(snacksSet);
		LinkedHashSet vehicleSet = new LinkedHashSet(snacksSet);
		vehicleSet.add("Car");
		vehicleSet.add("Bike");
		vehicleSet.add("Auto");
		vehicleSet.add(null);
		vehicleSet.add(10);
		System.out.println(vehicleSet.add("Truck"));
		System.out.println(vehicleSet);
	}

}
