package program14;
public class Program14 {
    public static void main(String[] args) {
      System.out.println("Random numbers between 1 and 100 are,");
        int n = 0;
      for(int i=0; i < 5 ; i++)
      System.out.println("Random Number ["+ (i+1) + "] : " + (int)(Math.random()*100));
   
    }
    
}
