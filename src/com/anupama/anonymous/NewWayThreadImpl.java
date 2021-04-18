package com.anupama.anonymous;

public class NewWayThreadImpl {

	public static void main(String[] args) {
		// Anonymous class using lambda
		Runnable runnable = ()-> {
			System.out.println("Old way of implementing thread");

		};

		Thread thread = new Thread(runnable);
		thread.start();
	}

}
