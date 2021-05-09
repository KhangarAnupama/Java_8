package com.anupama.stream;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void oldWay(ArrayList<Integer> ip) {
		ArrayList<Integer> newArray = new ArrayList<>();
		for(Integer integer : ip) {
			if(integer%2==0) {
				newArray.add(integer);
			}
		}
		System.out.println(newArray);
	}
	
	public static void newWay(ArrayList<Integer> ip) {
		ArrayList<Integer> newArray = (ArrayList<Integer>) ip.stream()
				.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(newArray);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ip = new ArrayList<>();
		ip.add(5);ip.add(15);ip.add(0);ip.add(10);ip.add(20);ip.add(30);ip.add(25);
		oldWay(ip);
		newWay(ip);
	}

}
