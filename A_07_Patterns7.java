import java.util.Scanner;
public class A_07_Patterns7
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      for(int i=5;i>=1;i--)
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
// 12345
// 1234
// 123
// 12
// 1
