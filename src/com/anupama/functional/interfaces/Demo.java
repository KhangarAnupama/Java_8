package com.anupama.functional.interfaces;

public class Demo implements MyFunctionalInterface{

	@Override
	public void sam() {
		System.out.println("Inside Demo");
		
	}
	
	public static void main(String[] args) {
		MyFunctionalInterface functionalInterface = ()-> System.out.println("Always called lambda dunction");
		functionalInterface.sam();
	}

}
