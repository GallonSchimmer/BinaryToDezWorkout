package binaryToDezInput;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryToDezApp {
	
	public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4 Step Binary (1111 or 1010) : ");
	
		String binaryToConvert = input.nextLine();
		System.out.println("Your selection to convert: " + binaryToConvert);
			
	    	//1111 = Array Position 0,1,2,3 = Fourth, Third, Second, First 
	    	// which are exp4, exp3, exp2, exp1
	    	
	    char expThree = binaryToConvert.charAt(0);
	    char expTwo = binaryToConvert.charAt(1);
	    char expOne = binaryToConvert.charAt(2);
	    char expZero = binaryToConvert.charAt(3);
	    
	    System.out.println("Value for 2exp3: " + expThree);
	    System.out.println("Value for 2exp2: " + expTwo);
	    System.out.println("Value for 2exp1: " + expOne);
	    System.out.println("Value for 2exp0: " + expZero);
	    
	    
	    int[] binary = new int[4];
	    
	    if(expThree == '1') {
	    	int exp3 = (int) Math.pow(2,3);
	    	 binary[0] = exp3;
			System.out.println("Forth Position Binary will be used: " + exp3);
	    }else {
	    	binary[0] = 0;
	    }
	    
	    if(expTwo == '1') {
	    	int exp2 = (int) Math.pow(2,2);
	    	binary[1] = exp2;
			System.out.println("Third Position Binary will be used: " + exp2);
	    }else {
	    	binary[1] = 0;
	    }
	    if(expOne == '1') {
	    	int exp1 = (int) Math.pow(2,1);
	    	binary[2] = exp1;
			System.out.println("Second Position Binary will be used: " + exp1);
	    }else {
	    	binary[2] = 0;
	    }	
	    if(expOne == '1') {
	    	int exp0 = (int) Math.pow(2,0);
	    	binary[3] = exp0;
			System.out.println("First Position Binary will be used: " + exp0);
	    }else {
	    	binary[3] = 0;
	    }	
	    
	   
		System.out.println("Binary " + binaryToConvert + " values are:  " + Arrays.toString(binary));
	    
		//input with a binary value 
		//for to add indexes with true values
		int dec = binary[0] + binary[1] + binary[2] + binary[3];
		System.out.println("Binary " + binaryToConvert + " in decimal is : " + dec);
	    
	}
	
}


//https://www.geeksforgeeks.org/how-to-initialize-an-array-in-java/
//https://xperti.io/blogs/initialize-an-array-in-java-with-values/
//https://blog.hubspot.com/website/initialize-array-java
//https://www.geeksforgeeks.org/java-program-to-write-an-array-of-strings-to-the-output-console/
//https://www.techtarget.com/whatis/definition/binary
//https://www.tutorialspoint.com/java/lang/math_exp.htm
//https://linuxhint.com/how-to-do-exponents-in-java/
//https://www.w3schools.com/java/java_user_input.asp
//https://www.geeksforgeeks.org/convert-a-string-to-character-array-in-java/
//https://www.w3schools.com/java/java_interface.asp
//https://www.w3schools.com/java/java_switch.asp
//https://www.baeldung.com/java-switch
//https://www.w3schools.com/java/java_user_input.asp
//
