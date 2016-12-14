package program19;
import java.util.Scanner;
public class Program19 {
    public static void main(String[] args)
    {
       int number,fact=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number:");
       number=sc.nextInt();
       for(int i=1;i<=number;i++)
       {
        fact=fact*i;
       }
      System.out.println("Factorial of "+number+" :"+fact);
    }
    
}
