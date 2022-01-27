package studio1;

import support.cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int a = ap.nextInt("Enter the first integer");
		int b = ap.nextInt("Enter the second integer");
		double average = (a+b)/2.0; 
		 
		System.out.println("Average of " + a + " and " + b + " is " + average +".");
	}

}
