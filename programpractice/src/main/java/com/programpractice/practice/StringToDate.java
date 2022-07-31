package com.programpractice.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static void main(String args[]) {
		String stringDate="26-07-2022";
		try {
		Date date=new SimpleDateFormat("dd-mm-yyyy").parse(stringDate);
		System.out.println("stringDate:"+"\t"+date);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
