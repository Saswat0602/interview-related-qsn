
/*
 * A number is called an Armstrong number if the sum of the cube of its digit
 * is equal to the number itself.An example would be 153 because
 * 1^3+5^3+3^3=153
 * */
import java.util.Scanner;

public class ArmstrongNumber {
	static int first;
	static int second;
	static int third;
	
	static void sum(int num) {
		first=(num%100)%10;
		second=(num%100)/10;
		third=num/100;
		
		int add=(first)*(first)*(first)+(second)*(second)*(second)+(third)*(third)*(third);
		if(add==num){
			System.out.println("it is an ARMSTRONG number");
		}else {
			System.out.println("it is NOT an ARMSTRONG number");
		}
			
	}
	public static void main(String[] args) {
		while(true) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
	
		sum(num);
		 
		}
	}
	 
}
