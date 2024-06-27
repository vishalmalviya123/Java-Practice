import java.util.Scanner;
public class A_06_PrimeNumbers
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Numbers:");
       int n = sc.nextInt();
       System.out.println("Prime Numbers between 1 and "+n);
       for(int i=1;i<=n;i++)
       {
          boolean isPrime = true;
          for(int j=2;j<i;j++)
          {
            if(i%j==0)
            {
              isPrime = false;
              break;
            }
          }
          if(isPrime)
              System.out.println(i+ " ");
       } 
   }
}  