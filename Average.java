package com.shubham;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		int eng=sc.nextInt();
		int phy=sc.nextInt();
		int mat=sc.nextInt();
		int sci=sc.nextInt();
		int com=sc.nextInt();
		int total;
		int average;
		total=eng+phy+mat+sci+com;
		System.out.println("Total is:"+total);
		average=total/5;
		System.out.println("Average is:"+average);
	}

}
