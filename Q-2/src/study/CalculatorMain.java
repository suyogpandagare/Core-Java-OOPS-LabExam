package study;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Operator: ");
		String optr = sc.next();
		
		try {
			int res = cal.calculator(num1, num2, optr);
			System.out.println("The final result ofter your operation "+num1+" "+ optr +" "+num2 +" => "+res);
		} catch (WrongOperatorException e) {

			e.printStackTrace();
		}
	}//end of main
	
	

}//end of class
