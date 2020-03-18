package com.java.code.practice;

public class String6_javaCode {

	public static void main(String[] args) {
		
		String business = "Preeminence Preservation Assets LLC";
		int a= business.length();
		System.out.println(a);
		
		for (int i=business.length()-1; i>=0;i--) {
			
			System.out.println(business.charAt(i));
			
		}
		
		String pallindrom="MOM";
		StringBuffer sf = new StringBuffer("MOM").reverse();
		
		
		
		if(pallindrom.equals(sf.toString())) {
		
		System.out.println("Its a Pllindrome");
		}
	}

}
