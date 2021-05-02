package com.anupama.colon.twoTimes;

public class Cases {
	
	private static void m1() {
		System.out.println("Method and constructor are alrenative for lambda expression");
	}
	
	private static String m2() {
		return "Method and constructor are alrenative for lambda expression";
	}
	
	private static void m3(int i) {
		System.out.println("Method and constructor are alrenative for lambda expression");
	}
	
	public static void main(String[] args) {
		// Compare run() of runnable with m1, m2, m3 
		// Different Access modifier allow 
		Runnable runnable = Cases::m1;
		
		// Diff return type allow
		runnable = Cases::m2;
		
		// Diff Arg not allow
		// runnable = Cases::m3; ----------- Not allow. Give compile time error
	}
	
	

}
