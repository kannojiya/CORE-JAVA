package javaapplication65;

import java.util.Scanner;

public class JavaApplication65 {
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Alphabet:");
        ch=sc.next().charAt(0);
        if((ch>='a'&&ch<='z') ||(ch>='A'&&ch<='Z'))
        {
            System.out.println("It is alphabet!");
        }
        else
        {
            System.out.println("It is not Alphabet");
        }
        
    }
    
}
