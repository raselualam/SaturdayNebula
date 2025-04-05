package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {

		//Array store multiple data using index
		
		int age = 27;										//Variable - Single value
		int[] ageNebula = new int[]{21, 24, 31, 28, 29};	//Array - Multipul Value

		//Array index		  		[0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageNebula[2]);
		System.out.println("Total Student Age : " + ageNebula.length);
		
		String[] nameNebula = new String[]{"Rajesh", "Majid", "Pascaleen", "Sana", "Injamam"};	//Array

		//Array index		  				[0] [1] [2] [3] [4]
		
		System.out.println("Student Name : " + nameNebula[2]);
		System.out.println("Total Student Name : " + nameNebula.length);
		
		//Multi-Dimentional Array
		int [][] ageNebula2D = {{21, 24, 31, 28, 29},						//[0][0] [0][1] [0][2] [0][3] [0][4]
								{22, 26, 32}};								//[1][0] [1][1] [1][2]
		
		System.out.println("Student Age 2D: " + ageNebula2D[0][3]);
																		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Rajesh", 21);
		Student.put("Majid", 25);
		Student.put("Pascaleen", 23);
		Student.put("Sana", 24);
		Student.put("Injamam", 24);
		
		System.out.println("Hashmap Student Age : " + Student.get("Sana"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		Capital.put(null, "null");
		
		System.out.println("Capital City : " + Capital.get("BD"));	
		
		//HashTable store multiple data using key-value pair, No Nulls, also is synchronized (only one thread can be modified)
		
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
//		Region.put(null, "null");
		
		System.out.println("Region : " + Region.get("BD"));	
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Tesla");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);	
	}
}