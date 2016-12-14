/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirror.pattern.pkg3;

/**
 *
 * @author DELL 3558
 */
public class MirrorPattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i=0;i<5;i++)
       {
           for(int j=1;j<5-i;j++)
           {
               System.out.print("");
           }
           for(int k=5;k<=i;k++)
           {
               System.out.print("*");
           } System.out.println("\n");

       }
    }
    
}
