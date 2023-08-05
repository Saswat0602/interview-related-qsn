import java.util.*;

public class fib {

	static int a = 0, b = 1, c = 0;

	static void printfib(int count) {
		if (count > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(" " + c);
			printfib(count - 1);
		}

	}

	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("ente rthe range");
		count = sc.nextInt();
		System.out.println("the elements are:");
		System.out.println(a + "\n" + b);
		printfib(count - 2);

	}

}