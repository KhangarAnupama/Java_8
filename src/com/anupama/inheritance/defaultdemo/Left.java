package com.anupama.inheritance.defaultdemo;

public interface Left {
	
	default void m1() {
		System.out.print("Left");
	}

}
