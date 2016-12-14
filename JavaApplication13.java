

package javaapplication13;

import java.util.*;

public class JavaApplication13 {

    public static void main(String[] args) {
       ArrayList<Integer> al=new ArrayList<Integer>();
       al.add(14);
       al.add(50);
       al.add(79);
       al.add(65);
       ArrayList<String> al1=new ArrayList<String>();
       al1.add("Meenu");
       al1.add("Lalman");
       al1.add("Kannojiya");
       al1.add("Brandy");
       Iterator it=al.iterator();
       while(it.hasNext())
      {  
       System.out.println(it.next());  
      }  
       Iterator itr=al1.iterator();
       while(itr.hasNext())
       {  
        System.out.println(itr.next());  
       }
       System.out.println("al1"+al1);
       al1.removeAll(al1);
        System.out.println("al1"+al1);
    }
    
}
