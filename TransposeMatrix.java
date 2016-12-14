/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transposematrix;

import java.util.Scanner;

/**
 *
 * @author DELL 3558
 */
public class TransposeMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter total row and column:");
        Scanner tm=new Scanner(System.in);
        int row=tm.nextInt();
        int column=tm.nextInt();
        int array[][]=new int[row][column];
        System.out.println("Enter Matrix:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                array[i][j]=tm.nextInt();
                System.out.print(" ");
            }
        }
        
        System.out.println("The transpose matrix is:");
          for(i=0;i<column;i++)
          {
              for(j=0;j<row;j++)
              {
                  System.out.print(array [j][i]+" ");
              }  
                  System.out.println(" ");
                
        
        
    }
    
}
}