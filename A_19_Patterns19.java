import java.util.Scanner;
public class A_19_Patterns19
{
  public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Numbers:");
     String s = sc.next();
     for(char i='e';i>='a';i--)
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
// abcde
// abcd
// abc
// ab
// a


