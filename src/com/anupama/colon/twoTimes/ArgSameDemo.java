package com.anupama.colon.twoTimes;

public class ArgSameDemo {
	
	public static int sumInDemoClass(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		ArgSame ar = (a,b) -> a+b;
		ar.sum(12, 10);
		
		// Equivalent TO
		
		ArgSame ar1 = ArgSameDemo :: sumInDemoClass;
		ar1.sum(12, 45);
	}

}
