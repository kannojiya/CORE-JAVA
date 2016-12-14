/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author DELL 3558
 */
public class Student {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) 
{
    
    int mark[] = new int[5];
        int i;
        int sum=0, avg;
        String name;
        Scanner st = new Scanner(System.in);
        System.out.println("Enter name:");
        String ss=st.nextLine();
	System.out.println("Enter Marks Obtained in 5 Subjects : ");
        for(i=0; i<5; i++)
        {
            mark[i] = st.nextInt();
            sum = sum + mark[i];
        }
	avg = sum/5;
        System.out.println("Average"+avg);
		
        System.out.println("Your Grade is ");
        if(avg>85)
        {
            System.out.println("+A");
        }
        else if(avg<84 && avg<=74)
        {
            System.out.println("A");
        }
        else if(avg<74 && avg<65)
        {
            System.out.println("C");
        }
        else if(avg<64 && avg<50)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("fail");
        }
}
    
}
