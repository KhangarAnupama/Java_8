package com.anupama.functions;

import java.util.function.Function;

public class Programme {

	public int old_square(int n) {
		return n*n;
	}

	public void samples() {
		java.util.function.Function<Integer, Integer> f = i-> i*i;
		System.out.println(f.apply(5));

		Function<String, Integer> length = s -> s.length();
		System.out.println(length.apply("Feel code"));

		Function<String, String> upper = s -> s.toUpperCase();
		System.out.println(upper.apply("Feel code"));
	}
	
	// Take the op of first and then apply on second... Same for n operations
	public void andThen() {
		Function<Integer, Integer> length1 = i -> 2*i;
		Function<Integer, Integer> length2 = j -> j*j*j;
		System.out.println(length1.andThen(length2).apply(2));
	}
	
	// Take the op of second and then apply on first...  Same for n operations
	public void compose() {
		Function<Integer, Integer> length1 = i -> 2*i;
		Function<Integer, Integer> length2 = j -> j*j*j;
		System.out.println(length1.compose(length2).apply(1));
	}

	public static void main(String[] args) {

		Programme programme = new Programme();
		System.out.println(programme.old_square(2));
		
		programme.samples();
		programme.andThen();
		programme.compose();
	}

}
