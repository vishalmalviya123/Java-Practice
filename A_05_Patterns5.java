import java.util.Scanner;
public class A_05_Patterns5
{
  public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Numbers:");
     int n = sc.nextInt();
     for(int i=1;i<=5;i++)
     {
       for(int j=1;j<=5;j++)
       {
          System.out.print(j);
       }
          System.out.println();
     } 
  }
}