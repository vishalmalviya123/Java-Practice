import java.util.Scanner;
public class A_16_RangeofStrongNumbers
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
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          int num=i;
          int Sum=0;
          int temp=num;

          while(num!=0)
          {
               int r=num%10;
               Sum=Sum+fact(r);
               num=num/10;     
          }
          if(Sum==temp)
              System.out.println(temp+"is a Strong Numbers:");
      }
   }         

}  