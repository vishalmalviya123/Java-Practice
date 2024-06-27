import java.util.Scanner;
public class A_12_Patterns12
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      String s = sc.next();
      for(char i='A';i<='E';i++)
      {
         for(char j='A';j<=i;j++)
         {
            System.out.print(i);
         }
            System.out.println();
      }
      
   }    
}

// Output

// A
// BB
// CCC
// DDDD
// EEEEE
