package com.anupama.inheritance.defaultdemo;

public class Test implements Left, Right {

	@Override
	public void m1() {
		Left.super.m1();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}
