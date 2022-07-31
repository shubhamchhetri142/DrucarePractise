package com.programpractice.practice;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateToString {

	public static void main(String args[]) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss mm-yyyy-dd");
		String strDate = dateFormat.format(date);
		System.out.println("Converted String: " + strDate);
	}
}
