import java.util.Scanner;
public class A_06_Patterns6
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=i;j++)
         {
             System.out.print(j);
         }
           System.out.println();
      } 
   }    
}

// Output
// 1
// 12
// 123
// 1234
// 12345