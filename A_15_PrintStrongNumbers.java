import java.util.Scanner;
public class A_15_PrintStrongNumbers
{
   static int fact(int n)
   {
      int fact=1;
      while(n>0)
      {
         fact=fact*n;
         n--;
      }
      return fact;
   }
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      int num=n,Sum=0,temp=n;
      while(num!=0)
      {
         int r=num%10;
         Sum=Sum+fact(r);
         num=num/10;
      }
      if(Sum==temp)
         System.out.println(temp+ "is a Strong Numbers:");
      else
         System.out.println(temp+"is Not a Strong Numbers:");

   }


}   