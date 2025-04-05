package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	int studentAge;
	String studentName;
	
	public Constructor(int age){
		studentAge = age;
	}
	
	public Constructor(String name){
		studentName = name;
	}
	
	public Constructor(int age, String name){
		studentName = name;
		studentAge = age;
	}
	
	public static void main(String[] args) {

		Constructor obj = new Constructor(28);
		
		System.out.println("Age Object 1 : " + obj.studentAge);
		
		Constructor obj2 = new Constructor(25, "Rajesh");
		
		System.out.println("Age Object 2 : " + obj2.studentAge);
		System.out.println("Name Object 2 : " + obj2.studentName);
		
		Constructor obj3 = new Constructor("Jahir");
		
		System.out.println("Name Object 3 : " + obj3.studentName);
	}
}