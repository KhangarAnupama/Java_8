package com.anupama.colon.twoTimes;

import com.anupama.inheritance.defaultdemo.Test;

/**
 * Double colon is used for method or constructor reference
 * @author Anupama Khangar
 *
 */
public class DoubleColonDemo {
	
	public static void m1() {
		System.out.println("Method and constructor are alrenative for lambda expression");
	}
	
	public void m2() {
		System.out.println("Method and constructor are alrenative for lambda expression");
	}
	
	public static void main(String[] args) {
		
		/**
		 * CASE 1 : STATIC METHOD
		 */
		
		// It called method reference. Here, run method referring m1 method
		Runnable runnable = DoubleColonDemo :: m1;
		Thread thread = new Thread(runnable);
		thread.start();
		
		// Equivalent to
//		Runnable runnable = () -> {
//			System.out.println("Method and constructor are alrenative for lambda expression");
//		};
		
		
		/**
		 * CASE 2 : INSTANCE METHOD
		 */
		
		// Use Object reference for instance function
		DoubleColonDemo colonDemo = new DoubleColonDemo();
		runnable = colonDemo :: m2;
	}

}
