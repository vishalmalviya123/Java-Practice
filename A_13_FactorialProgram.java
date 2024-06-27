import java.util.Scanner;
public class A_13_FactorialProgram
{
   public static void main(String[] args)
    {  
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Numbers:");
       int n = sc.nextInt();
       int num=5, fact=1;
       while(num>1)
       {
      
          fact=fact*num;
          num--;
       }
       System.out.println(num+"fact");
        
    }
}    