package com.java.immutable;

import java.util.HashMap;
import java.util.Map;

public class StringImmutableDemo {

	public static void main(String[] args) {
		
		
	  Map<MyDemo, String> map = new HashMap<>();
	  MyDemo myDemo1 = new MyDemo("Rohit");
	  MyDemo myDemo2 = new MyDemo("Swati");
	  map.put(myDemo1, "Demo1");
	  map.put(myDemo1, "Demo2");
	  
	  //map.get("Rohit");
	}

}


class MyDemo{
	
	String name;
	
	public MyDemo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("Inside has Code ");
		return 31 * name.hashCode();
	}


	
	
	
	
}