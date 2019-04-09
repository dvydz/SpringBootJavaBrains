package com.test;

import java.util.Arrays;
import java.util.List;

class Emp{
	String name;
	int id;
	String desig;
	
	public Emp() {
	
	}
	public Emp(String name, int id, String desig) {
		super();
		this.name = name;
		this.id = id;
		this.desig = desig;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
}

public class LambdaExpression {

	public static void input(Integer i) {
		
	}

	public static void main(String[] args) {

		List<Emp> empList=Arrays.asList(
				new Emp("David",1,"Java Developer"),
				new Emp("Avi",2,"Python Developer"),
				new Emp("Milan",1,"C# Developer")
				);
		
//		//System.out.println(System.currentTimeMillis());
//	//	int result=(int num)->System.out.println(num);
//		
//		
//		empList.forEach(emp->{
//			if(emp.getDesig().startsWith("Python"))
//				System.out.println(emp.getName()+" "+emp.getId()+" "+emp.getDesig());
//		});		
//		//System.out.println(System.currentTimeMillis());	
		

		
	}
}
