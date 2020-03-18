package com.java.code.practice;

import java.util.Arrays;

public class String3_java_code {

	public static void main(String[] args) {
		
		String country = new String ( "United States Of America");
		String [] countryarray = country.split(" ");
		
		System.out.println(Arrays.toString(countryarray));
		
		for (int i=0; i<countryarray.length;i++) {
			
			
			
			System.out.println(countryarray[i]);
			
			
			
		}
		

	}

}
