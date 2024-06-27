import java.util.Scanner;
public class A_05_PrintNaturalNumbers
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Numbers:");
       int n = sc.nextInt();
       int i=1,Sum=0;
       while(i<=200)
       {
          Sum=Sum+i;
          i++;
       } 
       System.out.println(Sum);
    }
}       