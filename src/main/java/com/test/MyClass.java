package com.test;

public class MyClass {

	public static void main(String[] args) {
	
		MyInterface obj=(String name)->System.out.println("Hello "+name);
		obj.showMessage("David");
	}
}
