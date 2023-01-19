// author sonali
package com.Question1;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> al=new ArrayList<Product>();  //using arraylist
		Product p1=new Product(1,"Mobile",20000);
		Product p2=new Product(2,"Laptop",60000);
		Product p3=new Product(3,"Tablet",10000);
		Product p4=new Product(4,"Watch",5000);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
	
		System.out.println("Sorting  products by Name");  
		  
		Collections.sort(al,new NameComparator());  
		for(Product st: al){  
		System.out.println(st.id+" "+st.name+" "+st.price);  
		}  
		System.out.println("------------------");
		
		
		
		System.out.println("Sorting products by price");  
		  
		Collections.sort(al,new ProductcomparatorPrice());   
		for(Product st: al){  
		System.out.println(st.id+" "+st.name+" "+st.price);  
		}  
		
		
		
	}

}