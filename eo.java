// write a java code to find even and odd number in an array using recursion

public class eo {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Even numbers:");

        printEven(arr, 0);

        System.out.println("Odd numbers:");

        printOdd(arr, 1);

    }

    public static void printEven(int[] arr, int index) {

        if (index >= arr.length) {

            return;

        }

        if (arr[index] % 2 == 0) {

            System.out.println(arr[index]);

        }

        printEven(arr, index + 2);

    }

    public static void printOdd(int[] arr, int index) {

        if (index >= arr.length) {

            return;

        }

        if (arr[index] % 2 != 0) {

            System.out.println(arr[index]);

        }

        printOdd(arr, index + 2);

    }

}