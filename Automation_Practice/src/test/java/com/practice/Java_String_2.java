package com.practice;

public class Java_String_2 {
	
	public static void main(String[] args) {
		
		/*int a ;
		a = 10;
		int b;
		b = 20;
		
		//System.out.println(a +  "  " + b); or
		System.out.println(a+b);
		System.out.println(a + " and " +b);
		System.out.println("A Value ::" + a +" and " + "B value::" +b);
		System.out.println("A Value is " + a + " and " + "B Value is " +b);*/
		
		String Firstname = "Fatema";
		String Lastname = "Begum";
		
		//System.out.println("Firstname " + Firstname);
		//System.out.println("Lastname " + Lastname);
		//System.out.println("First Name  " + Firstname + " and Last Name "+ Lastname);


		//System.out.println("Firstname " + Firstname);
		String f = "Fatema";
		String l = "Begum";
		int age = 10;
		System.out.println(f);
		
		//String f= String.format("%s", "Fatema");
		System.out.println(String.format("%s", "Fatema"));
		System.out.println(String.format("%s", f));
		System.out.println(String.format("First Name %s", f) +  String.format(" and Last Name %s", l));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(String.format("First Name %s || Last name %s || age %s", f, l , age));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(String.format("First Name %s \nlast name %s \nage %s", f,l,age ));
		
	}
	
	
	
	
	

}
