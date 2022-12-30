//Author:sonali



package com.question1;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	int salary;
	
	
	public Employee(int id, String name, int age, int salary) 		//constructor
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public int compareTo(Employee o) 	// logic
	{
		if(salary==0.salary) return 0;					
		else if(salary>o.salary) return 1;
		else return -1;
	}
	
	
		
	}
	
