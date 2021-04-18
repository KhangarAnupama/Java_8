package com.anupama.functions;

import java.util.function.Predicate;

public class Programme {
	
	public int old_square(int n) {
		return n*n;
	}
	
	public static void main(String[] args) {
		
		Programme programme = new Programme();
		System.out.println(programme.old_square(2));
		
		// New
		
		java.util.function.Function<Integer, Integer> f = i-> i*i;
		
		System.out.println(f.apply(5));
		
		// Predicate returns boolean value
		
		Predicate<Integer> predicate = i->i%2==0;
		
		System.out.print(predicate.test(4));
		System.out.print(predicate.test(5));
		
	}

}
