

import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		int num, number, temp, total=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();
		sc.close();
		number=num;
		
		for(;number!=0;number/=10) {
			temp = number%10;
			total = total + temp*temp*temp;
		}
		if(total==num)
			System.out.println("it is armstrong");
		else
			System.out.println("it is not an armstrong");
	

	}

}
