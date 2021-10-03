package com.java.immutable;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapImmutableKey {

	public static void main(String[] args) {
		
	  //Employee employee = new Employee("Rohit");	
	  
	  FackEmployee mutableEmployee = new FackEmployee("Rahul");
	  
	  Employee ImmutableEmployee = mutableEmployee; // Polymorphically we are assigning mutable object of Employee to Immutable reference.
		
	  Map<Employee, String> map = new HashMap<>();
	  map.put(ImmutableEmployee, "India");
	  
	  mutableEmployee.setFakeName("Rohan"); // Here we are changing the name 
	  
	  System.out.println(map.get(ImmutableEmployee));

	}

}

//79138838

//80294290