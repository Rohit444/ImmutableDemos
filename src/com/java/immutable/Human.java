package com.java.immutable;

public class Human {
	
	int adhaarNumber;
	String name;
	
	public Human(int adhaarNumber, String name) {
		super();
		this.adhaarNumber = adhaarNumber;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1234;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			
			return false;
		}
		if(obj == this) {
			return true;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Human otherHuman = (Human) obj;
		if(otherHuman.adhaarNumber != this.adhaarNumber) {
			return false;
		}
		if(!this.name.equals(otherHuman.name)) {
			return false;
		}
		if(this.name == null) {
			if(otherHuman.name != null) {
				return false;
			}
		}
		
		return true;
	}

}
