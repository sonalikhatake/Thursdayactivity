//Author:sonali

package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee em1=new Employee(1,"sagar",12,50000);
		Employee em2=new Employee(3,"nitin",30,60000);
		Employee em3=new Employee(5,"kiran",25,30000);
		Employee em4=new Employee(4,"arohi",13,20000);
		
		ArrayList<Employee> el=new ArrayList<>();
		eml.add(e1);				//adding the element 
		eml.add(e2);
		eml.add(e3);
		eml.add(e4);
		
		Collections.sort(eml);		//sorting the element in ascending order
		for(Employee o:eml)
		{
			System.out.println(o.id+" "+o.name+" "+o.age+" "+o.salary);
		}

	}

}