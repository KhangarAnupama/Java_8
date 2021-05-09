package com.anupama.peek.skip;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class PeekDemo {
	
	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<>();
		x.add("aa"); x.add("aa123"); x.add("bb"); x.add("cc"); x.add("a12"); 

		System.out.println(x);
		
		x.stream().filter(a -> a.contains("a"))
				.peek(a -> System.out.println(a))
				.collect(Collectors.toList());
	}

}
