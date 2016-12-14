package prac;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exam {

public static void main(String[] args) {
int x = 10;
float f= 5.67f;
String str = "Winter is coming";
char c ='a';
double d = 879.9087;
try {
            File newTextFile = new File("demo.txt");

            FileWriter fw = new FileWriter(newTextFile);
            fw.write(String.valueOf(x));
            fw.write(Integer.toString(x));
            fw.write("\n");
            fw.write(Float.toString(f)); 
            fw.write(String.valueOf(f));
            fw.write("\n");
            fw.write(c);
            fw.write("\n");
            fw.write(new Double(d).toString());
            fw.write("\n");
            fw.write(str);
            fw.write("\n");
            fw.write(x + " " +f +" " +c +" "+d+" "+str);
            fw.close();
            
            FileReader fr = new FileReader(newTextFile); 
            char [] a = new char[100];
            //fr.read(a);   
            
           // for(char each : a)
            //   System.out.print(each);  
            
            int i;  
            while((i=fr.read())!=-1)  
            System.out.print((char)i);   
            
            fr.close();

        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }
}

}
