import java.util.*;
import java.io.*;
public class even2 
{
    public static void main(String[] args)
    {
        //declare and initialize an array A
        int A[] = {77, 82, 100, 17, 95};
        //calling the user defined method countodds()
        //and store the result value inside an integer variable say ‘m’
        int m = countOdds(A, 0, A.length - 1);
        //print the result
        System.out.println("The number of odd elements in the array are: " + m);
    }
    
    //countOdds() method 
    public static int countOdds(int A[], int firstIndex, int lastIndex)
    {
        int count = 0;
        //checking numbers of elements in the array
        if(firstIndex <= lastIndex)
        {
            // if the element is odd then the count is incremented
            if(A[firstIndex] % 2 != 0)
            {
                count++;
            }
             count+=countOdds(A, firstIndex + 1, lastIndex);
        }
        return count;
    }
}