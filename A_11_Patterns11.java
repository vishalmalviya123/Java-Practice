import java.util.Scanner;
public class A_11_Patterns11
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=5;j++)
         {
            System.out.print(i);
         }
            System.out.println();
      } 
   }    
}

// Output
// 11111
// 22222
// 33333
// 44444
// 55555
