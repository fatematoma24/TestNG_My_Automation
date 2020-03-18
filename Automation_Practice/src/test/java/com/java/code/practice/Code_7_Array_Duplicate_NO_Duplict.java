package com.java.code.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Code_7_Array_Duplicate_NO_Duplict {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50, 20,30,40,50,60};
		//int [] b = {40,50,60,70,80,90};
		// How to find no duplicate number with single Array 
		
		Set<Integer> myset = new TreeSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			myset.add(a[i]);

			
		}
		

		System.out.println("Found No Duplicate::"+myset);
		
		
		/// How to get duplicate number in single Array
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("Found duplicate::"+ a[i]);
				}
				
				
			}
			
			
		}
		
		
	}

}
