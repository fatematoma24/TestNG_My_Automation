package com.java.code.practice;

import java.util.Set;
import java.util.TreeSet;

public class Code_6_FindArray_Duplicate_Numb {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60 };
		int[] b = { 30, 40, 50, 60, 70, 80, 90 };

		/*
		 * /// How to find duplicate number
		 * 
		 * for (int i=0; i<a.length;i++) {
		 * 
		 * //System.out.println(a[i]);
		 * 
		 * 
		 * for (int j=0;j<b.length;j++)
		 * 
		 * //System.out.println(b[j]);
		 * 
		 * if (a[i]==b[j]) {
		 * 
		 * System.out.println("Found my duplicate number::" +a[i]);
		 */

		Set<Integer> myset = new TreeSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			myset.add(a[i]);

		}

		for (int j = 0; j < b.length; j++) {
			myset.add(b[j]);

		}
		
		System.out.println("No Duplicate  = "+myset);  

//// set <Integer> myset = new TreeSet<Integer>();
		
		//for (){
		} 
		
		
	}
