package com.anupama.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
	
	public static void newWay(ArrayList<Integer> ip) {
		ArrayList<Integer> newArray = (ArrayList<Integer>) ip.stream().filter(i -> i%2 ==0).
				map(i -> i*2).collect(Collectors.toList());
		
		
		System.out.println(newArray);
	}
	
	public static String  m1(String a) {
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ip = new ArrayList<>();
		ip.add(5);ip.add(15);ip.add(0);ip.add(10);ip.add(20);ip.add(30);ip.add(25);
		System.out.println(ip);
		newWay(ip);
		
		ArrayList<String> x = new ArrayList<>();
		x.add("aa"); x.add("aa123"); x.add("bb"); x.add("cc"); x.add("a12"); 
		
		Stream<Object> x1 = x.stream().filter(a -> a.contains("a")).map(a -> Practice.m1(a));
		System.out.println(x1);
	}
	
}
