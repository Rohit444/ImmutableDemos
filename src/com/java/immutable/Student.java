package com.java.immutable;

public final class Student {
	
	private final int id;
	private final String name;
	private final Address address;
	
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddess() {
		//return new Address(address.getCity(), address.getState()); // giving a copy of the original Address object but this is not a good way
	    //  return new Address(address);  // Using copy constructor
		return Address.getInstance(address); // Using getInstance method 
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	



}
