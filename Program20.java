package program20;
public class Program20 {
public static void main(String[] args) 

    {
        String delims=",";
       String splitString="one,two,three,four,five";
       System.out.println("\n split words: \n");
       String[] tokens=splitString.split(delims);
       int tokenCount=tokens.length;
       for(int j=0;j<tokenCount;j++)
       {
           System.out.println("Split Output:"+tokens[j]);
       }
       int count=1;
       for(int i=0;i<=splitString.length()-1;i++)
       {
           if(splitString.charAt(i)== ' '&& splitString.charAt(i+1)!=' ')
           {
               count++;
           }
       }
        
    }
    
}
