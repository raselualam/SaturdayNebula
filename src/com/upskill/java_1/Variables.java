package com.upskill.java_1;

import com.upskill.java_2.Loops;

public class Variables extends Loops{
	
//	Variables in Java
	//Instance OR global variable - Variables declared in Class level, outside method
	//Local variable - variables declared in methods 
	//Static variable - variables belong to class and don't required creating object
	//Method parameter - variables used as method parameter

	public static void main(String[] args) {
		
		Variables obj = new Variables();			//className objectName = new className;
		
		System.out.println(president);
		System.out.println(obj.vicePresident);
		
		ny("Chuck");
		nj("Cory");
		
	}
	
	public static void ny(String senator){				//Method parameter
		
		String city = "Queens";							//Local variable 
		String county ="Nassau";						//Local variable 
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		
		System.out.println(senator);
	}
	
	public static String president = "Trump";			//Static variable
	
	public String vicePresident = "Vance";				//Non-Static variable
	
	public static String country = "USA";				//Instance OR global variable 
	
	public static String region = "North America"; 		//Instance OR global variable
	
	public static void nj(String senator){
		String city = "Bloomfield";
		String county ="Essex";
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		
		System.out.println(senator);
	}
	
	public static void ct(String senator){
		String city = "Hartford";
		String county ="Fairfield";
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		
		System.out.println(senator);
	}
}