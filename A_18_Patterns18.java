import java.util.Scanner;
public class A_18_Patterns18
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      String s = sc.next();
      for(char i='a';i<='e';i++)
      {
         for(char j='a';j<=i;j++)
         {
            System.out.print(j);
         } 
            System.out.println();
      }
   }    
}

// Output
// a
// ab
// abc
// abcd
// abcde
