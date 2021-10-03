package com.java.immutable;

public class FackEmployee  extends Employee{

	private String fakeName;
	
	public FackEmployee(String name) {
		super(name);
		this.fakeName = name;
	}

	@Override
	public String getName() {
		return fakeName;
	}

	public void setFakeName(String fakeName) {
		this.fakeName = fakeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fakeName == null) ? 0 : fakeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FackEmployee other = (FackEmployee) obj;
		if (fakeName == null) {
			if (other.fakeName != null)
				return false;
		} else if (!fakeName.equals(other.fakeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FackEmployee [fakeName=" + fakeName + "]";
	}
	
	
	

}
