/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author DELL 3558
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int calc=sc.nextInt();
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        int result=0;
        switch(calc){
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                result=a/b;
                break;
            default:
                System.out.println("Wrong Number ");
                
        }System.out.println("result="+result);
    }
    
}
