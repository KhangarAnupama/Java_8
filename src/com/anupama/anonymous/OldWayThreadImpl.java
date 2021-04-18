package com.anupama.anonymous;

public class OldWayThreadImpl {

	public static void main(String[] args) {
		// Anonymous class 
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Old way of implementing thread");

			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

	}
}
