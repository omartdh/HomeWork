package com.bayamp.utils;


import java.util.Scanner;
import org.testng.annotations.Test;

public class Factorial {
	
	@Test
	public static void test(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to find its factorial!");
		
		int number = input.nextInt();
		int fact = factorial(number);
		System.out.println("The factorial for the number you provided is: " + fact);
		
		input.close();
	}
	
	/*public static int factorial(int num) { 
	
		int result=1;
		for(int i = num; i >= 2; i--)
			result=result * i;
		
		return result;
	}*/
	
	
	public static int factorial(int num) { 
		
		if(num == 0)
			return 1;
		
		if(num == 2)
			return 2;
		else
			return factorial(num-1)*num;
		
	}
}
