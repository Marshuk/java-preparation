package com.javaexamples;

public class Stack {
	
	static void method1() {
		System.out.println("static method 1");
		Stack s = new Stack();
		s.method2();
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();

	}
	
	void method2() {
		System.out.println("instance method1");
		method3();
		
	}

static void method3() {
	System.out.println("static method2");
	Stack s1=new Stack();
	
	s1.method4();
}

void method4() {
	System.out.println("instance method2");
}
}


