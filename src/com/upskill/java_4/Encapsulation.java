package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";						//write & read
	private int ssn = 512547;								//write
	private String username = "raselalam";					//read
	
	
	//Setter Method - name									//set the data, write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name									//get the data, read
	public String getName(){
			return name;
	}
	
	//Setter Method - ssn									//set the data, write
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - name									//get the data, read
	public String getUserName(){
		return username;
	}
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Mahfuz");
		System.out.println(obj.getName());
		obj.setSSN(99999);
		System.out.println(obj.getUserName());
	}
}