import java.util.*;
// Java Function Programs
// Other Java Programs

// This Java program demonstrates how to calculate and print prime numbers.


// 2, 3, 13 are prime numbers.


public class prime2 {

 public static void main(String[] args) {

  int num = 20, count;

  for (int i = 1; i <= num; i++) {
   count = 0;
   for (int j = 2; j <= i / 2; j++) {
    if (i % j == 0) {
     count++;
     break;
    }
   }

   if (count == 0) {
    System.out.println(i);
   }

  }
 }
}