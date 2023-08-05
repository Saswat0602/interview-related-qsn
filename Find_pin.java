
import java.util.Scanner;

public class Find_pin {
	static int MaxFind(char ch1[]) {
		
		int max = ch1[0];
		for(int i=0; i<ch1.length;i++) {
			
			if(ch1[i]>max) {
				max = ch1[i];
			}
		}
		return max;
	}
	
	//min method
	static int MinFind(char arr11[]) {
		int min = arr11[0];
		
		for(int i=0;i<arr11.length;i++) {
			
			if(arr11[i]>min) {
				min = arr11[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int input1 = 3521;
		int input2 = 2452;
		int input3 = 1352;
		
		// convert into array of input1
		String str1 = "";
		str1 = String.valueOf(input1);
		char ch1[];
		ch1 = str1.toCharArray();
		
		//convert into array of input2
		String str2 = "";
		str2 = String.valueOf(input2);
		char ch2[];
		ch2 = str2.toCharArray();
		
		//convert into array of input3
		String str3 = "";
		str3 = String.valueOf(input3);
		char ch3[];
		ch3 = str3.toCharArray();
		
		// for input1 to get max and min value
		int max1 = MaxFind(ch1);
		System.out.println(max1);
		int min1 = MinFind(ch1);
		
		//for input2 to get max and min value
		int max2 = MaxFind(ch2);
		int min2 = MinFind(ch2);
		
		//for input3 to get max and min value
		int max3 = MaxFind(ch3);
		int min3 = MinFind(ch3);
		
		// Now your key is
		int key = ((max1 + max2 + max3) + (min1 + min2 + min3));
		
		System.out.println("Our Key is "+ key);
		
		/*char arr10[] = {2,5,7,6,3,10};
		
		System.out.println(MaxFind(arr10));
		*/
		
		
	}
  }