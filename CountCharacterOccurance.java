
public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s="Java is simple";
		
		int totalCount =s.length();// total length of s
		
		int totalCount_afterRemoval = s.replace("a",	"").length();
		//total length after removing a
		
		int totalCount_afterremoval= s.replace("J","").length();
		
		int count = totalCount-totalCount_afterRemoval;
		
		System.out.println("Number occurances of a is :: "+count);
		

	}

}
