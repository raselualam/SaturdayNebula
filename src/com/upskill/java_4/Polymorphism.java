package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
/* 
  	Polymorphism is the ability of an object to take on many forms.
  	
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car("Red");
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int bonus = 10000;
		int profitSharing = 37000;
		int rental = 3000;
		int sideHussel = 10000;
		int totalIncome = calculateAnnualIncome + bonus + profitSharing + rental + sideHussel;
		System.out.println("My Annual Income = " + totalIncome);
	}
	
	public static void car(){
		System.out.println("My Car is Tesla !");
	}
	
	public static void car(int door){
		System.out.println("My Car is Tesla !, it has door : " + door);
	}
	
	public static void car(String color){
		System.out.println("My Car is Tesla !, it has color : " + color);
	}
}