import java.util.Scanner;
public class A_20_SwapTwoNumbersWIthUsingThirdVariable 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Numbers:");
       int num = sc.nextInt();

       int a=10;
       int b=20;

       System.out.println("Before Swapping:");
       System.out.println("Before Swapping a and b: "+a);
       System.out.println("Before Swapping a and b: "+b);

    
       int c=a;
       a=b;
       b=c;

       System.out.println("After Swapping:");
       System.out.println("After Swapping a and b:"+a);
       System.out.println("After Swāpping a and b:"+b);

   }    
}
