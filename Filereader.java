/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author DELL 3558
 */
public class Filereader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        File fl=null;
        BufferedReader br=null;
        try
        {
            File fl=new File("H:\\file.txt");
            BuffredReader br=new BuffredReader(new FileReader(fl));
            String str;
            while((str=br.readline()!=null);
            {
                System.out.println();
            }
            
        }
        catch(Excaption ex)
        {
            System.out.println(ex.toString());
            
        }
        Finally
                {
                    if (br!=null)
                    br=null;
                    if(fl!=null)
                    fl=null;
                    
                }
    }
    
    
}
