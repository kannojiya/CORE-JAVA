/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

public class Matrix {

    
    public static void main(String[] args) {
       int m,n,c,d;
        Scanner sn=new Scanner(System.in);
       System.out.println("Enter the number of rows and column:");
       m=sn.nextInt();
       n=sn.nextInt();
       int first[][]=new int[m][n];
       int second[][]=new int[m][n];
       int sum[][]=new int[m][n];
       System.out.println("Enter number in First matrix:");
       for(c=0;c<m;c++)
       for(d=0;d<n;d++)
       first[c][d]=sn.nextInt();
       System.out.println("Enter number in second matrix:");
       for(c=0;c<m;c++)
       for(d=0;d<n;d++)
       second[c][d]=sn.nextInt();
       for(c=0;c<m;c++)
       for(d=0;d<n;d++)
       sum[c][c]=first[c][d]+second[c][d];
       System.out.println("enter sum of matrix");
       {
           for(c=0;c<m;c++)
           {
               for(d=0;d<n;d++)
               
                   System.out.print(sum[c][c] +"\t");
                   System.out.print("");
           }
       }
       
    }
    
}
