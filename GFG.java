
import java.util.*;

class GFG {
	static void Even(int L, int R) {
		if (R < L) {
			return;
		}
		if (R % 2 == 0)
			Even(L, R - 2);
		else
			Even(L, R - 1);
		if (R % 2 == 0) {
			System.out.print(R + " ");
		}
	}
	static void Odd(int L,	int R) {  
		if (R < L) {
			return;
		}
		if (R % 2 == 1)
			Odd(L, R - 2);
		else
			Odd(L, R - 1);
		if (R % 2 == 1) {
			System.out.print(R + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the the staring point");
		int L = sc.nextInt();
		System.out.println("enter the the ending point");
		int R= sc.nextInt();
		System.out.println("Even numbers:");
		Even(L, R);
		System.out.println("Odd numbers:");
		Odd(L, R);
	}
}
