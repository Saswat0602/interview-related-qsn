

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements{
   public static void main(String[] args){
       int arr[]={1,1,2,3,3,4,9};
       int freq[]=new int[arr.length]; 
       // Sets all elements in the array to -1
       Arrays.fill(freq, -1);
       // Prints the array elements
       System.out.println("The array elements are"+Arrays.toString(arr));
       unique(arr,freq);          
  }
  static void unique(int arr[], int freq[]){
     int count;
     for(int i=0; i<arr.length; i++){
     count=1;
     for(int j=i+1; j<arr.length; j++){
       if(arr[i]==arr[j]){
        count++;
        freq[j]=0;
  }
 }
  if(freq[i]!=0){
     freq[i] = count;
 } 
}
  System.out.print("Unique elements");
   for(int i=0; i<arr.length;i++){
       if(freq[i]==1)
         System.out.print(arr[i]+" ");
   }
   }
}

