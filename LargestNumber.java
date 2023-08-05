
import java.util.*;
public class LargestNumber {
public static void main(String args[])
 {
int a[] =new int [10];
int n;

Scanner sc =new Scanner(System.in);
System.out.println("enter the range");
n=sc.nextInt();
System.out.println("enter the array elemnt");
		for(int i =0;i<n;i++)
		{
			a[i]= sc.nextInt();
			}


System.out.println("Given Array:  ");
for(int i = 0; i < a.length; ++i)
System.out.print(a[i] + " ");
System.out.println("\n\nLargest Number is " + findLargest(a, a.length-1));
}
public static int findLargest(int[] a, int index) {
    if (index > 0) {
        return Math.max(a[index], findLargest(a, index-1));
    } else {
        return a[0];
    }
}
}