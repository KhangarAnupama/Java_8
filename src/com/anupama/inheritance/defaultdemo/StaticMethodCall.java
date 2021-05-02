package com.anupama.inheritance.defaultdemo;

public class StaticMethodCall implements InterfStatic{
	
	public static void main(String[] args) {
		// Static method called by Using Interface name only.
		// default we written for provide implementation, it directly not available to implemented class
		InterfStatic.m1();  
		
		// All are invalid cases
//		m1();
//		StaticMethodCall.m1();
//		StaticMethodCall staticMethodCall = new StaticMethodCall();
//		staticMethodCall.m1();
		
	}
	

}
