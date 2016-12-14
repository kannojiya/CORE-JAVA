package cast
public class Cast
{
  public static void main(String args[])
   {
	byte b;
 	int i;
	b=72;
	i=b*3;
	System.out.println("integer to byte"+i);
	b=(byte)i;
	System.out.println("byte to integer"+i);
    	double d=123.456;
	i=(int)d;
	System.out.println("double to integer");
     }
 }