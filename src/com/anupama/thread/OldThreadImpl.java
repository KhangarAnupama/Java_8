package com.anupama.thread;

public class OldThreadImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Parent Thread");
		}
	}

	public static void main(String[] args) {
		// Old Way
		OldThreadImpl impl = new OldThreadImpl();
		Thread t = new Thread(impl);
		t.start();
		for(int j=0; j<=10; j++) {
			System.out.println("Parent Thread");
		}

	}

}
