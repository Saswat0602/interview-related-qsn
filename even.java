import java.util.*;

public class even{
   public static void main(String[] args)
    {
     int a[];
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the range of the aarray");
     int n =sc.nextInt();
     a= new int[n];
     System.out.println("enter trhe element of the array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {  
        if(a[i]%2==0){
            System.out.println(a[i]+"=is a even number");

        }
        else{
            System.out.println(a[i]+"=odd number");
        }
     }
        
    }
}
