/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmtom;

import java.util.Scanner;
public class KmToM {

    public static void main(String[] args) {
        int m = 1000;
        System.out.println("Enter Kilometer: ");
        double km;
        Scanner reader = new Scanner(System.in);
        km = reader.nextDouble();
        double kmtometer=km*m;
        System.out.println( km+ " kilometers is " +kmtometer+ " in meters");
        
    }

}
