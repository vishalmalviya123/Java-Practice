import java.util.Scanner;
public class A_14_Patterns14
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number:");
      String s = sc.next();
      for(char i='A';i<='E';i++)
      {
        for(char j='A'; j<=i;j++)
        {
            System.out.print(j);
        }
            System.out.println();
      }  
   }    
}

// Output:
// A
// AB
// ABC
// ABCD
// ABCDE