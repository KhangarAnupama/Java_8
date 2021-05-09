package com.anupama.stream;

import java.util.ArrayList;

public class PracticeDoubleColon {

	private static boolean containsA(String ip) {
		return ip.contains("a");
	} 

	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<>();
		x.add("aa"); x.add("aa123"); x.add("bb"); x.add("cc"); x.add("a12"); 

		System.out.println(x);

		x.stream().filter(PracticeDoubleColon::containsA).forEach(b -> System.out.println(b));

		// We can write println in diff way as well
		x.stream().filter(PracticeDoubleColon::containsA).forEach(System.out::println);


	}

}
