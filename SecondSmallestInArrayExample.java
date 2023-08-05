// Task
// Create a Source class and implement below given method.
// getSecondSmallest(int[]arr): accept an array of integer elements and return the second smallest element in the array
//sample input {23, 45, 32, 22, 20, 96}
// sample output 22

public class SecondSmallestInArrayExample {
	
	public static int getSecondSmallest(int[]a, int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];// 2nd element because index starts from 0
	}

	public static void main(String[] args) {
		int a[]= {23,45,32,22,20,20,22,96};
		int b[]= {44, 56, 66, 22, 55, 99};
		System.out.println("Second Smallest:"+getSecondSmallest(a,6));
		System.out.println("Second Smallest:"+getSecondSmallest(b,6));
		// TODO Auto-generated method stub

	}

}
