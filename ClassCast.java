package classcast;
public class ClassCast
{
 public static void main(String args[])
 {
  byte b;
  int i;
  b=65;
  i=b*2;
  System.out.println("integer to byte "+i);
  b=(byte)i;
  System.out.println("byte to integer"+b);
  double d=123.756;
  i=(int)d;
  System.out.println("double to int"+i);
 }
}