package com.anupama.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapDemo {
	
	public static void main(String[] args) {
		
		List<User> users = Arrays.asList(
				new User("Anna", 5, Arrays.asList("12", "23")),
		new User("Boby", 4, Arrays.asList("212", "323")),
		new User("Christa", 9, Arrays.asList("102", "923")),
		new User("Dobby", 2, Arrays.asList("132", "253")));
		
		Optional<String> op = users.stream().map(list -> list.getPhoneNumbers().stream()).
		flatMap(newStream -> newStream.filter(list1 -> list1.equals("923"))).findAny();
		
		op.ifPresent(System.out::println);
	
	}

}
