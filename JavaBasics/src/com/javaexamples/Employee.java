package com.javaexamples;

public class Employee {
	static String company_name;
	static String location;
	String emp_name;
	int emp_salary;

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.emp1();
		e1.display();
	}
	
	static {
		company_name = "Amazon";
		location = "hyderabad";
	}
	void emp1() {
	Employee e1 = new Employee();
	e1.emp_name = "ramu";
	e1.emp_salary=50000;
	System.out.println(company_name);
	System.out.println(location);

	System.out.println(e1.emp_name);
	System.out.println(e1.emp_salary);
	emp2();

}
	
	static void emp2() {
		Employee e2 = new Employee();
		e2.emp_name = "ravi";
		e2.emp_salary=550000;
		System.out.println(company_name);
		System.out.println(location);

		System.out.println(e2.emp_name);
		System.out.println(e2.emp_salary);
	}
	void display() {
		System.out.println(company_name);
	}
	
}
