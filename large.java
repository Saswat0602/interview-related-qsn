import java.util.*;

public class large{

public static void main(String[] args){

int number[],size,large;

Scanner sc = new Scanner(System.in);
System.out.println("enter the  range of the array");
size = sc.nextInt();
number =new int[size];
System.out.println("enter the element of the array");
for (int i=0;i<number.length;i++){
number[i]=sc.nextInt();

}
large = number[0];
for (int i=0 ; i<number.length;i++){
if(large<number[i]);
{
large=number[i];
}
}

System.out.println("largest number is "+large);
}


}