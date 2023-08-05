
/*
 * Write a program to print this pattern
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 * */
public class PatternPrinting {
    
	public static void main(String[] args) {
		int n=1;
		for(int i=1; i>=n; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
  }
}
