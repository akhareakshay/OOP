package com.staticNonStatic.inheritance;

public class Example {
	static int a = m1();
	static {
		System.out.println("Example SB");
	}
	int x = m2();
	{
		System.out.println("Example SB");
	}

	Example() {
		System.out.println("Example Constructor");
	}

	static int m1() {
		System.out.println("Example SV is created");
		return 10;
	}

	int m2() {
		System.out.println("Example NSV is created");
		return 20;
	}

	void abc() {
		System.out.println("Example Abc");
	}

	void bbc() {
		System.out.println("Example Bbc");
	}

}
