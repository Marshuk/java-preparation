package com.javaexamples;

public class Count {
	static int inc=0;
	
	{
		
		inc++;
		System.out.println("count:"+inc);
	}
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		System.out.println(inc);


		
		
		

	}

}
