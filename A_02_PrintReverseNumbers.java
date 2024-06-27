import java.util.Scanner;
public class A_02_PrintReverseNumbers
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Numbers:");
         int n = sc.nextInt();
         int i=10;
         while(i>=1)
         {
            System.out.println(i);
            i--;
         }      
     }
}   