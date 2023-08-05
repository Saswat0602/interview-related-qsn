

import java.util.Arrays;

public class SecondSmallest {
	/*
	 * The simplest approach is to sort the array and return
	 * the element present at 1st index.
	 * 
	 * This approach won't work if the array elements are repeated.
	 */
	public static int findSecondSmallest(int[] arr) {
		
		if(arr.length==0 || arr.length<2) {
			return Integer.MAX_VALUE;
		}
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
		int arr[]= {1,1,2,1};
		System.out.println(findSecondSmallest(arr));
	}
	 

}
