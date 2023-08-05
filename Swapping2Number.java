
/*
 * Swap two numbers without using third variable in java
 * */
public class Swapping2Number {

	public static void main(String[] args) {
		int a=30, b=60;
		
		System.out.println("Before swapping values are.."+a+" "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swapping values are.."+a+" "+b);
		

	}

}
