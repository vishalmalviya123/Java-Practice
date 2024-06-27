import java.util.Scanner;
public class A_17_ReverseNumbers
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the Numbers:");
       int num = sc.nextInt();
       int temp=num,Sum=0;
       while(num!=0)
       {
         int r=num%10;
         Sum=Sum*10+r;
         num=num/10;
       }
       System.out.println(Sum);
   }
}   