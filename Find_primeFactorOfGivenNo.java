

import java.util.Scanner;

/*
 * Write a program to find out the prime factors of a given number.
 * input Format:
 * input consists of integer
 * 
 * OUTPUT FORMAT:
 * Refer the sample output format
 * 
 * Sample input: 10
 * Sample output: 2, 5
 * */
public class Find_primeFactorOfGivenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to find out the Factors::");
		int num=sc.nextInt();
		int factors;
		for(int i=2;i<num;i++) {
			factors=num%i;
			if(factors==0 && isPrime(factors))
				System.out.println(i+"");
		}
		sc.close();

	}
	public static boolean isPrime(int n) {
		boolean prime =true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}

}
