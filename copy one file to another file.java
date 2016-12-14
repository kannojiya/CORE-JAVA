
package javaapplication16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.util.Scanner;
import static sun.java2d.cmm.ColorTransform.Out;
class Person
{
  String fname;
  String lname;
  int age;
public String getFname()
  {
   return fname;
  }
public void setFname(String fname)
{
  this.fname=fname;
}
public String getLname()
  {
   return lname;
  }
public void setLname(String lname)
{
  this.lname=lname;
}
public int Age()
  {
   return age;
  }
public void setAge(int age)
{
  this.age=age;
}
public String toString()
{
 StringBuffer sb=new StringBuffer();
  sb.append(fname);
  sb.append("\n");
  sb.append(lname);
  sb.append("\n");
  sb.append(age);
  sb.append("\n");
  return sb.toString();
 }
}
public class ObjectIODemo
{
 public void WriteObject(String filname)
{
  Object ObjectOutputStream = null;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter fname");
  String myfname=sc.nextLine();
  System.out.println("enter lname");
  String mylname=sc.nextLine();
  System.out.println("enter age");
  int myage=sc.nextInt();
  Person p= new Person();
  p.setFname(myfname);
  p.setLname(mylname);
  p.setAge(myage);
  try
{
      ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filname));
  obj.writeObject(p);
}
catch(IOException ex)
 {
   System.out.println(ex.toString());
 }
}
public static void main(String args[])
{
  ObjectIODemo od=new ObjectIODemo();
  od.WriteObject("D:\\java\\person.txt");
;
}
}
