package com.sundayclasspractice;

public class Java_Code {
	
	static int a =10;   ///Static 
	static int b =20;
	static int c;

	int getmoney() {
		 c= a+b;
		return c;
	
	}
	 static void getsalary() {
		c = b-a;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		Java_Code obj = new Java_Code();
		///obj.getmoney();
		
		System.out.println(obj.getmoney()); ///best
		///obj.getsalary();
		Java_Code.getsalary();
		
	}
		
	
	
}
