import java.util.Scanner;
public class A_09_Patterns9 
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Numbers:");
     int n = sc.nextInt();
     for(int i=5;i>=1;i--)
     {
        for(int j=5;j>=i;j--)
        {
            System.out.print(i);
        }
           System.out.println();
     }  
  }    
}

// Output
// 5
// 44
// 333
// 2222
// 11111