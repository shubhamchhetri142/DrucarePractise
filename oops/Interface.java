package com.oops;

import java.util.Scanner;

interface client{
	void input();//public+abstract
	void output();
}

public class Interface implements client{
	String name;double sal;
	public void input() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter UserName:");
			name=sc.nextLine();
			System.out.print("Enter Salary:");
			sal=sc.nextDouble();
		}
		}
	public void output() {
		System.out.println("Employee Name is:"+name+"\n"+"Employee Salary is:"+sal);
	}

	public static void main(String[] args) {
			client u=new Interface();
			u.input();u.output();
	}

}
