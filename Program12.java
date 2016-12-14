
package program12;
public class Program12 {
    public static void main(String[] args) {
     int rem=0,s=0,s1=0,rem2=0,m=0,s2=0,rem3=0;
        int n = 0;
     while(n>0)
       {
        rem=n%10;
        s=s+rem;
        n=n/10;
       }
    while(s>0)
    {
        rem2=s%10;
        s1=s1+rem2;
        s=s/10;
    }
    while(s1>0)
     {
        rem3=s1%10;
        s2=s2+rem3;
        s1=s1/10;
       }
    if(s1==1||s2==1)
    {
        System.out.println("magic number");
    }
    else
    {
        System.out.println("normal number");
    }
    }
   }
