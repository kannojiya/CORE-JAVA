package randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;


public class Randomaccessfile {
    public static void main(String[] args) throws IOException  {
        try
        {
        RandomAccessFile raf=new RandomAccessFile("E:\\java7","rw");
        raf.writeUTF("Hello Brandy");
        raf.seek(0);
        System.out.println(""+raf.readUTF());
        raf.seek(5);
        raf.writeUTF("BRANDY is a My Dog");
        raf.seek(0);
        System.out.println(""+raf.readUTF());
         
        }
        catch(IOException ex)
        {
          ex.printStackTrace();  
        }
    
}
    }
