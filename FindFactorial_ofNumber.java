

import java.util.Scanner;

/*
 * Find the factorial of a number with recursion ?
 * */
public class FindFactorial_ofNumber {

	public static void main(String[] args) {
		//input from user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		int factorial =1;
		for(int i=number;i>=1;i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+number+" is "+ factorial);
	}

}
