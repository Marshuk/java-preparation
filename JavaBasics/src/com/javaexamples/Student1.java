package com.javaexamples;

public class Student1 {
	int studentid;
	String student_name;
	String address;
	int age;

	public static void main(String[] args) {
		System.out.println("student 1 Details:");
		Student1 s1 = new Student1();
		s1.studentid=110;
		s1.student_name="Raju";
		s1.address="vizag";
		s1.age=20;
		System.out.println(s1.studentid);
		System.out.println(s1.student_name);
		System.out.println(s1.address);
		System.out.println(s1.age);
		
		System.out.println("Student 2 details:");
		Student1 s2 = new Student1();
		s2.studentid=120;
		s2.student_name="Rahul";
		s2.address="hyderabad";
		s2.age=25;
		System.out.println(s2.studentid);
		System.out.println(s2.student_name);
		System.out.println(s2.address);
		System.out.println(s2.age);



		
		
		
		
		// TODO Auto-generated method stub

	}

}
