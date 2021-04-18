package com.anupama.anonymous;

public class DemoImpl {
	
	public static void main(String[] args) {
		// We cann't use lambda expression here, cz Demo is not functional interface
		// But, we can use anonymous classes, function in lambda expression
		// That proves that anonymous classes are more powerful than lambda expression
		// Imp Anonymous Expression != lambda expression
		Demo demo = new Demo() {
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
		};
		demo.m1();
		demo.m2();
	}

}
