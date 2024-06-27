import java.util.Scanner;
public class A_12_PalindromeNumbers 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      int temp=n,Sum=0;
      while(n!=0)
      {
        int r=n%10;
        Sum=Sum*10+r;
        n=n/10;
      }
      if(Sum==temp)
         System.out.println(temp+ "is a Palindrome Numbers:");
      else
        System.out.println(temp+ "is Non Palindrome Numbers:"); 
   }
}


