package com.javaexamples;
public class Garbage {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroyed");
			}

	public static void main(String[] args) {
		System.out.println("main method started");
		Garbage g1= new Garbage();
		Garbage g2= new Garbage();
		Garbage g3= new Garbage();

		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);


		g1=null;		
		g2=null;
		g3=null;

		
		System.out.println(g1);
		System.out.println(g3);

		System.gc();

		System.out.println(g2);
		System.out.println(g1);



		
		
	}

}
