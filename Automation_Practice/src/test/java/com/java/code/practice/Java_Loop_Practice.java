package com.java.code.practice;

import org.testng.Assert;

public class Java_Loop_Practice {
	
	public static void main(String[] args) {
		
		// positive 0-100 loop (RULES IS </<=))
		
		
		for (int i=0; i<=100; i++) {
			//System.out.println(i);
			
			
//			if (i!=20) {
//				
//				System.out.println("found my value::"+i);
//				break;
//			} else {
//				continue ; 
//				
//			}
//			
			if (i==20) {
				System.out.println("Found my value::"+i);
				Assert.assertEquals(i, 20);
				
			}
			
			else if (i==10) {
				System.out.println("Fiund my value::"+i);
				Assert.assertEquals(i, 10);
				
			}
			
			
			
			
			
		}
		
		// Negative Loop 100-0 (Rules is >/>=)
		/*
		for (int i=100; i>=0; i--) {
			System.out.println(i);
			
		}
		*/

		
		
	}
	
	
	
	

}
