package com.anupama.functions;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;


public class FunctionType {
	
	
	public static void biFunction() {
		BiFunction<Integer, Integer, Integer> predicate = (a,b) -> a+b;
		System.out.println(predicate.apply(3, 3));
	}
	
	public static void dtFunction() {
		IntFunction<Integer> a = i -> i+i;
		LongFunction<Long> b = i -> i*i;
		DoubleFunction<Double> c= i -> i*1.23;
	
		System.out.println(a.apply(10));
		System.out.println(b.apply(100000000000l));
		System.out.println(c.apply(10.010));
	}
	
	public static void unary() {
		UnaryOperator<Integer> u = i -> i*i;
		IntUnaryOperator a = i -> i+i;
		LongUnaryOperator b = i -> i*i*i;
		DoubleUnaryOperator c = i -> 4.23*i;
		
		System.out.println(u.apply(2));
		System.out.println(a.applyAsInt(2));
		System.out.println(b.applyAsLong(2));
		System.out.println(c.applyAsDouble(2));
		
	}
	
	public static void main(String[] args) {
		biFunction();
		dtFunction();
		unary();

	}

}
