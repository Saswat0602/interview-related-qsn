
import java.util.Scanner;

/*
 *  Write a java program to validate the full name of an employee. Create and throw a user define
 *  exception if firstName and lastName is blank.
 *  Your task here is to implement a java code should match the specifications in a precise manner.Consider default visibility
 *  of classes, data fields and methods unless mentioned otherwise.
 *  
 *  Task:-Define MyException class
 *  create a class Source and implement the below given method
 *  checkName(String firstName,String lastName); throws a user define exception if firstName and lastName is block else return name
 *  
 *  sample input:- Alan Hasley
 *  sample output:- AlanHasley
 */

public class Source {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter firstName ::");
		String firstName=sc.nextLine();
		System.out.print("Enter secondName ::");
		String secondName=sc.nextLine();
		String fullName=checkName(firstName,secondName);
		System.out.println("Name is :: "+fullName);

	}
	public static String checkName(String firstName,String secondName) {
		String fullName=firstName.concat(secondName);
		return fullName;
	}

}
