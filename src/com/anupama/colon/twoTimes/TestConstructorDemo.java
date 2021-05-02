package com.anupama.colon.twoTimes;

public class TestConstructorDemo {
	
	public static void main(String[] args) {
		intef i = ConstructorReturnType :: new;
		i.get();
		// Equivalent to
		
		intef i1 = () -> new ConstructorReturnType();  
		System.out.println(i1.get());
	}
}