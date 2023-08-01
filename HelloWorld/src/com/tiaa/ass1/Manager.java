package com.tiaa.ass1;

public class Manager extends Employee{
	
	private float comm;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, String firstName, String lastName, float sal,float comm) {
		super(id, firstName, lastName, sal);
		this.comm=comm;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [comm=" + comm + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public float getSalary()
	{
		return super.getSalary()+comm;
	}
	
	

	//@Override
	public float getComm()
	{
		return comm;
	}
	
	
	

}
