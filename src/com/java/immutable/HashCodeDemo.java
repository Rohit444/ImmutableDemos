package com.java.immutable;

public class HashCodeDemo {

	public static void main(String[] args) {
		
		Human rohit = new Human(1002,"Rohit");
		Human avilash = new Human(1002,"Rohit");
		
		Human anshuman = rohit;
		
		
//		System.out.println(rohit.hashCode());
//		System.out.println(avilash.hashCode());
//		
//		String str1 = "AL";
//		String str2 = "GL";
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		System.out.println(rohit == avilash);
//		System.out.println(rohit.equals(avilash));
//		
//		System.out.println(rohit.equals(anshuman));
		
		System.out.println(rohit.equals(avilash));
		

	}

}
