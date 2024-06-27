import java.util.Scanner;
public class A_11_RangeOfPerfectNumbers
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      for(int num=1;num<=n;num++)
      {
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
      }
   }
}   