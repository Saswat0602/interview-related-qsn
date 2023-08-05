
import java.util.Scanner;

/*
 * Sarah is planning to spend a week at her friend's summer house in Amsterdam. Sarah is not sure if her father will allow
 * her to go with the friend's.However, Sarah went to her father and ask for his permission. Sarah's father works at DoSelect as a programmer. He 
 * came to Sarah with one condition, he wants Sarah to code something related to "AMSTERDAM" and if she does it correctly, she will be allowed to go.
 * 
 * Sarah's father gave a string and wants her to write a function that returns the number of times 'am'appears in the String ignoring the case
 * 
 * sarah is not so good at programming and need your help.
 * your task here is to implements a java code based on the following specifications.
 * 
 *  Task:- class InAmsterdam
 *  implement the below method for the class
 *  
 *  int countAm(String str); return the number of times "am" appers in the String ignoring the case
 *  
 *  sample input:- I Am in Amsterdam am I ?
 *  
 *  sample output:- 2
 *  
 *  import java.io.*;
 *  import java.util.*;
 *  import java.text.*;
 *  import java.math.*;
 *  import java.util.regex.*;
 *  
 */
public class Sourcee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String::");
		String str=sc.nextLine();
		int totalCount =str.length();
		int count_afterRemoval=str.replace("Am","").length();
		int count=totalCount-count_afterRemoval;
		
		System.out.println(count);

	}

}
