
import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a program to print all the unique elements in the given array.
 * 
 * INPUT FORMAT:
 * The first line of input denotes the size of an array(N)
 * 
 * The remaining line of input denotes the 'N' elements.
 * 
 * OutPut Format:
 * Print all the unique elements
 * 
 * Sample input:
 * 5 1 1 2 2 3
 * Sample Output:
 * 3
 * */
public class PrintAll_uniqueElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ArrayList::");
		// Creating the array
        int arr[] = {8, 1, 1, 2, 3, 4, 4, 5, 6};
        int freq[] = new int[arr.length];
        // Sets all elements in the array to -1
        Arrays.fill(freq, -1);
        // Prints the array elements
        System.out.println("The array elements are "+Arrays.toString(arr));
        
        unique(arr,freq);
    }
    
    // Function that counts the frequency of elements 
    // and prints unique elements
    static void unique(int arr[], int freq[])
    {
        int count;
        for(int i = 0; i<arr.length; i++)
        {
            // Resets count to 1 after each element
            count=1;
            for(int j = i + 1; j<arr.length;j++)
            {
                // If another occurence of the current element is found 
                // in the array then increments the counter
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j] = 0;
                }
            }
            // Stores the frequency of each element
            if(freq[i]!=0)
            {
                freq[i] = count;
            }
        }
        
        // Prints the unique elements
        System.out.print("The unique elements in the array are: ");
        for(int i = 0; i<arr.length;i++)
        {
            if(freq[i]==1)
                System.out.print(arr[i]+" ");
        }

	}

}
