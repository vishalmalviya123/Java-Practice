import java.util.Scanner;
public class A_01_PrintNumbers
{   
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Numbers:");
     int n = sc.nextInt();
     int i=1;
     while(i<=10)
     {
         System.out.println(i);
         i++;
     }
     
    }
  }
  
  