
import java.util.HashSet;

public class RemoveDuplicate_UsingHashSet_Array {

	public static void main(String[] args) {
		int[] a= {1,2,3,2,4,4,2,5,6,6};
		
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0; i<a.length; i++) {
			hs.add(a[i]);
		}
		for(int no:hs) {
			System.out.println(no+"");
		}
	}

}
