package com.anupama.peek.skip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkipDemo {
	
	public static void main(String[] args) {
		List<Integer> x = new ArrayList<>();
		x.add(12); x.add(10);x.add(2); x.add(90);x.add(55); x.add(33);
		System.out.println(x);
		
		x = x.stream().skip(2).
		filter(a -> a%2 == 0)
		.collect(Collectors.toList());
		
		System.out.println(x);

	}

}
