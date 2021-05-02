package com.anupama.predicate;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;


public class PredicateType {
	
	
	public static void biPredicate() {
		BiPredicate<Integer, Integer> predicate = (a,b) -> a==b;
		System.out.println(predicate.test(3, 3));
	}
	
	public static void dtPredicate() {
		IntPredicate predicate = i -> i%2 == 0;
		LongPredicate longPredicate = i -> i%2 == 0;
		DoublePredicate doublePredicate = i -> i%2 == 0;
	
		System.out.println(predicate.test(10));
		System.out.println(longPredicate.test(100000000000l));
		System.out.println(doublePredicate.test(10.010));
	}
	
	public static void main(String[] args) {
		biPredicate();
		dtPredicate();

	}

}
