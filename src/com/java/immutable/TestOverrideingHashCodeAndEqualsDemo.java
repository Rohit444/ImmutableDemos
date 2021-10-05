package com.java.immutable;

import java.util.HashMap;
import java.util.Map;


// This demo represents effect of overriding hashCode and equals methods of Employee object when use as a Key in HashMap

public class TestOverrideingHashCodeAndEqualsDemo {
	
	public static void main(String[]args) {
		
		Employee1 emp1 = new Employee1("Rohit");
		Employee1 emp2 = new Employee1("Rohit");
		Map<Employee1, String> map = new HashMap<>();
		map.put(emp1, "emp1");
		map.put(emp2, "emp2");
		
		System.out.println("hashCode value of emp1 "+emp1.hashCode());
		System.out.println("hashCode value of emp2 "+emp2.hashCode());

		
		System.out.println(map.size());
		
	}

}

class Employee1{
	
	private String name;

	public Employee1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee1 other = (Employee1) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + "]";
	}
	
	
}