package com.multithreading;

class Child extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.start();
		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread is Running.");
		}

	}

}
