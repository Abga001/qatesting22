package com.qa.exercises;

public class walker {
	
	public static String factorial(int num1) {
		
		int divisor = 2;//initialised variable
		int result = 1;//initialised variable
		
		while (num1 > 1) {
			if (num1 % divisor == 0) {
			num1 /= divisor;
			divisor++;
			result++;
			}
			else {
				return "Not a factorial";
			}
			
		}
		
		
		return result + "!";
		
		
	}
	

}
