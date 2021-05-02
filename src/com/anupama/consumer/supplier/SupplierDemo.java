package com.anupama.consumer.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		Supplier<Date> r = () -> new Date();
		System.out.println(r.get());
		
	}

}
