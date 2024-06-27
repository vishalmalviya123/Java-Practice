import java.util.Scanner;
public class A_10_Patterns10
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      for(int i=1;i<=5;i++)
      {
        for(int j=5;j>=i;j--)
        {
            System.out.print(i);
        }
           System.out.println();
      } 
   }    
}

// Output
// 11111
// 2222
// 333
// 44
// 5