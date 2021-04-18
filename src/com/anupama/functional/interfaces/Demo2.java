package com.anupama.functional.interfaces;

public class Demo2{
	
	public static void main(String[] args) {
		MyFunctionalInterface2 functionalInterface = (a, b) -> a+b;
		System.out.println(functionalInterface.add(2, 3));
	}

}
