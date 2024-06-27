import java.util.Scanner;
public class A_16_Patterns16
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
            System.out.print(i);
        }
            System.out.println();
      }
   }   

}

// Output
// a
// bb
// ccc
// dddd
// eeeee

