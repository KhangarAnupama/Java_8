package com.anupama.consumer.supplier;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	String author;
	
	public ConsumerDemo(String author) {
		this.author = author;
	}
	public ConsumerDemo() {
	}
	
	/**
	 * Understand object creation and assigning  value operation as well. Brush up concept
	 */
	
	public void chaining() {
		ConsumerDemo consumerDemo = new ConsumerDemo("Pradeep :");
		Consumer<String> a= s -> System.out.println(consumerDemo.author + " WE use consumer, while storing data in DB");
		Consumer<String> b= s -> System.out.println(consumerDemo.author + " Chaining is appliacable in consumer");
		Consumer<String> c= s -> System.out.println(consumerDemo.author + " But it contains only andThen function");
		
		Consumer<String> result= a.andThen(b).andThen(c);
		result.accept(consumerDemo.author);
	}
	
	public void chaining1() {
		Consumer<String> a= s -> System.out.println(author + " WE use consumer, while storing data in DB");
		Consumer<String> b= s -> System.out.println(author + " Chaining is appliacable in consumer");
		Consumer<String> c= s -> System.out.println(author + " But it contains only andThen function");
		
		Consumer<String> result= a.andThen(b).andThen(c);
		result.accept(author);
	}
	
	public static void main(String[] args) {
		Consumer<String> c= s -> System.out.println(s);
		c.accept("Code behave as we write");
		
		ConsumerDemo consumerDemo = new ConsumerDemo("Anupama :");
		consumerDemo.chaining();
		
		consumerDemo.chaining1();
	}

}
