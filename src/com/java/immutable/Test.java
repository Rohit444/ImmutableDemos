package com.java.immutable;

public class Test {

	public static void main(String[] args) {
    
    Address address = new Address("Varanasi", "UP");
	Student s = new Student(1, "Rohit Sharma",address);
	
	System.out.println(s);
	System.out.println(address.hashCode());
	
	Address address1 = s.getAddess();
	address1.setCity("Noida");
	address1.setState("UP");
	
	System.out.println(s);
	System.out.println(address1.hashCode());
	

	}

}


// Advantages of immutable class -> Thread safe so can be used in multithreaded environment 
//								 ->	Can be use as a constant. Because once initializesd its value can not be changed
//								 -> Can	be use as a Keys in HashMap