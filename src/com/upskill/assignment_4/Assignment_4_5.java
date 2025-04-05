package com.upskill.assignment_4;

import java.util.Arrays;

	//	Check whether two strings are anagram of each other from an array?

public class Assignment_4_5 {

	static int NO_OF_CHARS = 256; 
	
    /* Driver program to test to print printDups*/
    public static void main(String args[]) 
    { 
        char str1[] = ("geeksforgeeks").toCharArray(); 
        char str2[] = ("forgeeksgeeks").toCharArray(); 
  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + "anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
	  
    /* function to check whether two strings are anagram of each other */
    static boolean areAnagram(char str1[], char str2[]) 
    { 
        // Create 2 count arrays and initialize 
        // all values as 0 
        int count1[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count1, 0); 
        int count2[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count2, 0); 
        int i; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (i = 0; i < str1.length && i < str2.length; i++) { 
            count1[str1[i]]++; 
            count2[str2[i]]++; 
        } 
        
        //count1 = g=2, e=4, k=2, s=2, f=1, o=1 r=1
       //count2 = g=2, e=4, k=2, s=2, f=1, o=1 r=1
  
        // If both strings are of different length. 
        // Removing this condition will make the program 
        // fail for strings like "aaca" and "aca" 
        if (str1.length != str2.length) 
            return false; 
         //13=13
  
        // Compare count arrays 
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count1[i] != count2[i]) 
                return false; 
        
        //count1=count2
        
        return true; 
    } 
  
}
