package com.programpractice.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	public static void main(String args[]) {
		List<EmployeeClass> employee = new ArrayList<>();
		employee.add(new EmployeeClass("Sai", 101L, 20, 200.00, "Male", "IT"));
		employee.add(new EmployeeClass("Jaggu", 102L, 25, 2000.00, "Male", "HR"));
		employee.add(new EmployeeClass("Arun", 103L, 22, 3000.00, "Male", "Admin"));
		employee.add(new EmployeeClass("Chandrakala", 104L, 23, 4000.00, "Female", "HR"));
		employee.add(new EmployeeClass("Bharath Chary", 105L, 25, 4500.00, "Male", "IT"));
		employee.add(new EmployeeClass("Poojesh Naidu", 106L, 23, 5000.00, "Mlae", "Admin"));

//		employee.stream().map(EmployeeClass::getDepartment).forEach(System.out::println);
//		Map<String,Long> emp=employee.stream().collect(Collectors.groupingBy(EmployeeClass::getDepartment,Collectors.counting()));
//		System.out.println(emp);
//		Map<String, Double> avg = employee.stream().collect(
//				Collectors.groupingBy(EmployeeClass::getGender, Collectors.averagingInt(EmployeeClass::getAge)));
//		System.out.println(avg);
//		Map<String, Double> avgSal = employee.stream().collect(
//				Collectors.groupingBy(EmployeeClass::getEmpName, Collectors.averagingDouble(EmployeeClass::getSalary)));
//		System.out.println(avgSal);
//		List<String> upper=employee.stream().map(m->m.getEmpName().toUpperCase()).collect(Collectors.toList());
//		System.out.println(upper);
//		List<String> lower=employee.stream().map(m->m.getEmpName().toLowerCase()).collect(Collectors.toList());
//		System.out.println(lower);
		
		EmployeeClass max=employee.stream().max((a1,a2)->a1.getSalary().compareTo(a2.getSalary())).get();
		System.out.println(max);
		
//		Optional<EmployeeClass> emplo=employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeClass::getSalary)));
//		System.out.println(emplo);
//		
//		Optional<EmployeeClass> empl=employee.stream().collect(Collectors.minBy(Comparator.comparingDouble(EmployeeClass::getSalary)));
//		System.out.println(empl);
//		
//		Optional<EmployeeClass> emp1=employee.stream().sorted(Comparator.comparingDouble(EmployeeClass::getSalary).reversed()).skip(0).findFirst();
//		System.out.println(emp1.get());
//		
//		Map<String, Map<Double, List<EmployeeClass>>> map=employee.stream().collect(Collectors.groupingBy(EmployeeClass::getEmpName,Collectors.groupingBy(EmployeeClass::getSalary)));
//		System.out.println(map);
	}
}
