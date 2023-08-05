

public class FindSecondSmallest {
	public static int findSecondSmallestWithoutSorting(int[] arr) {
		
		int smallest       = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		if(arr.length == 0 || arr.length <2) {
			return secondSmallest;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(smallest>arr[i]) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			if(smallest < arr[i] && secondSmallest > arr[i]) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
		
	}

	public static void main(String[] args) {
		// int[] arr = {11,3,2,4,5};
		
		int[] arr= {1,3,1,1,1,1,1};
		// int[] arr={1, 3,1,1,1};
		
		int result =findSecondSmallestWithoutSorting(arr);
		
		if(result == Integer.MAX_VALUE) {
			System.out.println("Second smallest doesn't exist");
		}else {
			System.out.println(result);
		}
	}

}
