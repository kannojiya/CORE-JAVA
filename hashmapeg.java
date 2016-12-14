package hashmap;
import java.util.*;
public class HashMap2 {
public static void main(String[] args) {
       HashMap<Integer,String> hm=new HashMap<Integer,String>();
       hm.put(01 , " Meenu");
       hm.put(02 , "Poonam");
       hm.put(03 , "Sujal");
       for(Map.Entry m:hm.entrySet())
       {
           System.out.println(m.getKey()+""+m.getValue());
       }
    }
    
}
