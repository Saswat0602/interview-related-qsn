// write a java code to find greatest  in an array using recursion

public class max { 
   
    static int findMax(int arr[], int n) 
    { 
        if (n == 1) 
            return arr[0]; 
        return Math.max(arr[n - 1], findMax(arr, n - 1)); 
    } 
   
    public static void main(String args[]) 
    { 
        int arr[] = { 10, 324, 45, 90, 9808 }; 
        int n = arr.length; 
        System.out.println("Maximum in given array is " + 
                            findMax(arr, n)); 
    } 
}