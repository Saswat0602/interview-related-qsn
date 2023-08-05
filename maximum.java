
//Largest Element of the array using Recursion in Java
import java.util.*;

public class maximum {
    static int largest() {
        int arr[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of the array");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter the element of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i;
        int max = arr[0];        
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Largest in given array is " + largest());
    }
}