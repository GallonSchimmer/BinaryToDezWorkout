package binaryToDez;

import java.util.Arrays;

public class BinaryToDezApp {
	
	public static void main(String[] args) {
		
		//Only checking 1111 in Dezimal, no binary to decimal conversion
		//using exponentials for every Value of the Array [8,4,2,1]
		
	BinaryArray powers = new BinaryArray();
	int exp0 = powers.exp0;
	int exp1 = powers.exp1;
	int exp2 = powers.exp2;
	int exp3 = powers.exp3;
	
	int[] binary = new int[4];
	
	binary[0] = exp3;
	binary[1] = exp2;
	binary[2] = exp1;
	binary[3] = exp0;
	
	System.out.println("Binary I I I I values are:  " + Arrays.toString(binary));
	
	//input with a binary value 
	//for to add indexes with true values
	int dec = binary[0] + binary[1] + binary[2] + binary[3];
	System.out.println("I I I I in decimal is : " + dec);
	
	
	}
}
