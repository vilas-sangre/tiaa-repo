package com.tiaa.ass1;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private float sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String lastName, float sal) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sal=" + sal + "]";
	}
	
	
	public final float getSalary()
	{
		return sal;
	}
	

}
