import java.util.Scanner;
public class A_09_PrintMultiplication
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:"); 
      int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=10;j++)
         {
            System.out.println(j+"*"+i+"="+j*i+"\t");
         }
      } 
      System.out.println();
   }
}   