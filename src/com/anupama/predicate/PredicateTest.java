package com.anupama.predicate;

import java.util.function.Predicate;

/**
 * WE use predicate whenever have boolean expression.
 * Its always return type is boolean.
 * Input is any type
 * @author Anupama Khangar
 *
 */
public class PredicateTest {


	public static void or() {
		int[] x = {12, 34, 67, 45, 66, 78, 20, 34, 55};

		Predicate<Integer> x1 = (i) -> i%2 ==0;
		Predicate<Integer> x2 = (i) -> i%5 ==0;


		for (int j : x) {
			if(x1.or(x2).test(j)) {
				System.out.println(j);
			}
		}
	} 

	public static void and() {
		int[] x = {12, 34, 67, 45, 66, 78, 20, 34, 55};

		Predicate<Integer> x1 = (i) -> i%2 ==0;
		Predicate<Integer> x2 = (i) -> i%5 ==0;


		for (int j : x) {
			if(x1.and(x2).test(j)) {
				System.out.println(j);
			}
		}
	}

	public static void negate() {
		int[] x = {12, 34, 67, 45, 66, 78, 20, 34, 55};
		Predicate<Integer> x1 = (i) -> i%2 ==0;
		for (int j : x) {
			if(x1.negate().test(j)) {
				System.out.println(j);
			}
		}
	}


	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> i%2==0;
		System.out.println(p.test(18));

		// Predicate returns boolean value

		Predicate<Integer> predicate = i->i%2==0;

		System.out.print(predicate.test(4));
		System.out.print(predicate.test(5));
		or();
		and();
		negate();
	}
}
