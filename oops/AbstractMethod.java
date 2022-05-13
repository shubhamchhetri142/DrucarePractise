//package com.oops;
//
//abstract class Programming{
//	public abstract void Devloper();
//}
//class HTML extends Programming{
//	@Override
//	public void Devloper() {
//		System.out.println("Tim Berners Lee");
//	}
//}
//class Java extends Programming{
//	@Override
//	public void Devloper() {
//		System.out.println("James Gosling");
//		}
//}
//public class AbstractMethod {
//
//	public static void main(String[] args) {	
//		HTML H=new HTML();
//		Java J=new Java();
//		H.Devloper();
//		J.Devloper();
//	}
//
//}
package com.oops;

abstract class Flowers
{
	public abstract void Smell();
	public abstract void Rank();
}
class Rose extends Flowers
{
	@Override
	public void Smell() {
		System.out.println("Good");
	}
	@Override
	public void Rank() {
		System.out.println("1st");
	}
}
class Lilly extends Rose
{
	@Override
	public void Smell() {
		System.out.println("It is also good");
		
	}
}
class AbstractMethod{
	public static void main(String[] args) {
		Flowers r=new Rose();
		Flowers l=new Lilly();
		r.Smell();
		l.Smell();
		l.Rank();
	}
}