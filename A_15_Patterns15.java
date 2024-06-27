import java.util.Scanner;
public class A_15_Patterns15
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      String s = sc.next();
      for(char i='E';i>='A';i--)
      {
         for(char j='A';j<=i;j++)
         {
            System.out.print(j);
         }
           System.out.println();
      }
   }    
}

// Output
// ABCDE
// ABCD
// ABC
// AB
// A
