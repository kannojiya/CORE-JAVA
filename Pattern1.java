package pattern1;
public class Pattern1 {
    public static void main(String[] args) {
     
        int i,j,k=8;
        for(i=0;i<5;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            k=k-2;
            for(k=0;k>=j;k++)
            {
                System.out.print("* ");
              
            }System.out.println("\n");
        }
        
    for(i=0;i<4;i++)
    {
       for(j=0;j<i;j++)
       {
           System.out.print(" ");
       }
       for(k=0;k<4-i;k++)
       {
           System.out.print("*");
       }
       System.out.print("\n");
    }
    }

    }