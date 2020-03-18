package com.java.code.practice;

import java.util.Arrays;

public class Code_5_Array_java {
	
	public static void main(String[] args) {
		
		//10,20,30 // old way how to write Array;
		int [] a = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]= 30;
		
		System.out.println(Arrays.toString(a));
		
		int max=Arrays.stream(a).max().getAsInt();
		System.out.println(max);
		
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println(min);
		
		
		//// new way How to write Array:
		int [] b= {10,20,30,40,50};
		
		System.out.println(Arrays.toString(b));
		
		int max2 = Arrays.stream(b).max().getAsInt();
		System.out.println(max2);
		
		int min2 = Arrays.stream(b).min().getAsInt();
		System.out.println(min2);
		
		
		
		int [] c = new int [a.length+b.length];
		
		//System.out.println(Arrays.toString(c));
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
		
		
		int [] d = {20,30,40,50,60,70};
		int [] e = {2,4,6,8};
		
		int [] f = new int [d.length+e.length];
		
		System.out.println(Arrays.toString(f));
		
		System.arraycopy(d, 0, f, 0, d.length);
		System.arraycopy(e, 0, f, d.length, e.length);
		System.out.println(Arrays.toString(f));
		
		
			
		}
		
			
		
				
		
		
	}
	
	

