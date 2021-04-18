package com.anupama.functions;

import java.util.ArrayList;

public class NewThreadImpl{



	public static void main(String[] args) {
		
		
		// New Thread
		Runnable runnable = () ->{
			for(int j=0; j<=10; j++) {
				System.out.println("Parent Thread");
			}

		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		for(int j=0; j<=10; j++) {
			System.out.println("Child Thread");
		}
		
		ArrayList a = new ArrayList<>();
		a.toString();

	}

}
