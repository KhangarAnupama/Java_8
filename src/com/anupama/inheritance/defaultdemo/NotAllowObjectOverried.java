package com.anupama.inheritance.defaultdemo;

public interface NotAllowObjectOverried {
	
	default void m1() {
		
	}
	
	default void m2() {
		
	}

	// Nor allow to override object class functions
//	default int hashcode() {
//		
//	}

}
