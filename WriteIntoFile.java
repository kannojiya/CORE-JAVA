package write.into.file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class WriteIntoFile 
{
 public static void main(String[] args)
 {
  String text;
  try
   {
    Scanner sc=new Scanner(System.in);   
    text=sc.nextLine();
    FileOutputStream fos=new FileOutputStream("H:/demo.txt");
    fos.write(text.getBytes());
    System.out.println("written into the file");
    }
  catch(FileNotFoundException ex)
    {
       System.out.println("File not found");
    }
  catch(IOException io)
  {
       System.out.println("some problem");
  }
  int i=0;
  try
  {
      FileInputStream fis=new FileInputStream("H:/java programs/demo.txt");
      while((i=fis.read())!=-1)
      {
          System.out.print((char)i);
      }
  }
  catch(Exception e)
  {
      
  }
  
 }
    
}
