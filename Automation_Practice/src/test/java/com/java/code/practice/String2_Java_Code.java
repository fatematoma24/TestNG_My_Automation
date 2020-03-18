package com.java.code.practice;

public class String2_Java_Code {

	public static void main(String[] args) {
		
		/// String immutable bcz its storage in pool
		String firstname = new String ("Fatema");
		firstname.concat("Begum");
		
		System.out.println(firstname);
		
		
		/// StringBuffer and StringBuilder is mutable bcz it's storage in Heap
		StringBuffer firstname2 = new StringBuffer ("Fatema");
		firstname2.append("Begum");
		System.out.println(firstname2);
		
		StringBuilder firstname3 = new StringBuilder ("Fatema");
		firstname3.append("Begum");
		System.out.println(firstname3);

	}

}
