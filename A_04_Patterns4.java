import java.util.Scanner;
public class A_04_Patterns4
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
            System.out.print(i);
        }
           System.out.println();
      } 
   }    
}


// Output:
// 1
// 22
// 333
// 4444
// 55555