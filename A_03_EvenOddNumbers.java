import java.util.Scanner;
public class A_03_EvenOddNumbers
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      if(n%2==0)
        System.out.println(n+"is a Even Numbers:");
      else 
        System.out.println(n+"is a Odd Numbers:");
   }
}  