package com.tiaa.ass1;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(101,"Ramesh","Sharma",20000);
		//emp1 is a Class Reference
		System.out.println(emp1);
		Manager man1=new Manager(102,"Shyam","Sharma",30000,3000);
		System.out.println(man1);
		
		Employee e2=new Manager(103,"Sita","Sharma",30000,3000);
		System.out.println(e2.toString());
		System.out.println(((Manager)e2).getComm()); //Down Casting
		
		

	}

}
