import java.util.Scanner;
public class A_10_PerfectNumbers 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int num = sc.nextInt();
      int Sum=1;
      for(int i=2;i<=num/2;i++)
      {
         if(num%i==0)
          Sum=Sum+i;
      }
      if(Sum==num)
      {
         System.out.println(num+"is a Perfect Numbers:");
      }
      else
        System.out.println(num+"is not a Perfect Numbers:");

   }

}
   