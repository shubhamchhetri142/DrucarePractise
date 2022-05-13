package com.oops;
class Hide{
	private String name;
	private int PhoneNumber;
	public void setHide(String n,int pn) {
		name=n;
		PhoneNumber=pn;
	}
	public String getname() {
		return name;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
}

public class Encapsulation{
	public static void main(String args[]) {
		Hide h=new Hide();
		h.setHide("Drucare", 987654321);//set method calling
		System.out.println(h.getname());//get name method calling
		System.out.println(h.getPhoneNumber());//get number calling
	}
}