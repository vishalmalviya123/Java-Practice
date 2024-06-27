import java.util.Scanner;
public class A_18_ArmstrongNumbers 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt(); 
      int temp=n,r,Sum=0;
      while(n!=0)
      {
         r=n%10;
         Sum=Sum+(r*r*r);
         n=n/10;
      }
      if(Sum==temp)
      { 
        System.out.println(temp+"Armstrong Numbers:");
      } 
      else
      System.out.println(temp+"Non-Armstrong Numbers:");

   }
}   