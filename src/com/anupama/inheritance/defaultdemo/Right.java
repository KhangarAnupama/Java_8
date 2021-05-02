package com.anupama.inheritance.defaultdemo;

public interface Right {
	
	default void m1() {
		System.out.print("Right");
	}

}
