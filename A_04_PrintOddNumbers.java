import java.util.Scanner;
public class A_04_PrintOddNumbers
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      int n = sc.nextInt();
      for(int i=1;i<=10;i++)
      {
         if(i%2==1)
         {
            System.out.println(i);
         }
      }
   }
}
