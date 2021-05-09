package com.anupama.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.anupama.stream.Practice;

public class MapDemo {
	
	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<>();
		x.add("aa"); x.add("aa123"); x.add("bb"); x.add("cc"); x.add("a12"); 

		System.out.println(x);
		
		List<User> x1 = x.stream().filter(a -> a.contains("a"))
				.map(name -> new User(name)).collect(Collectors.toList());
		System.out.println(x1);
		
	}

}
