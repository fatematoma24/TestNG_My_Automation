package com.java.code.practice;

import java.util.Arrays;

public class Code_4_ {
	
	public static void main(String[] args) {
		
		// 10,20,30,40
		
		//int a =10;
		/*int [] a = {10,20,30,40};
		int [] b = {30,40,50,60};
		
		int [] c = new int [a.length + b.length];
		
		System.out.println(Arrays.toString(c));
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
		
		
		//System.out.println(Arrays.toString(b));
		//System.out.println(Arrays.toString(c));
		*/
		
		
		int [] a =  {10,20,30,40};
		int [] b = {40,50,60,70};
		
	   //int [] c= new int[3];
		int [] c = new int [a .length + b.length];	
	
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 0, c, 0, a.length);
		
		
	
		
		
		
		
		
	}
	
	

}
