import java.util.*;

public class HashMapMethod{

     public static void main(String []args){
         Map<Integer,String> m = new HashMap<Integer,String>();
         
         System.out.println(m.put(101,"Hello"));
         System.out.println(m.put(102,"Mikki"));
         System.out.println(m.put(101,"Nikki"));
         System.out.println(m.put(103,"Sazzie"));
         
         //collection view of map
         //keySet() values() entrySet()
         // this will print all the key s value
         Set s = m.keySet();
         System.out.println(s);
         
         // this will print all the values
         Collection c = m.values();
         System.out.println(c);
         
        // this will print key value pair
        Set s1 = m.entrySet();
        System.out.println(s1);
        
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Map.Entry p = (Map.Entry)itr.next();
            System.out.println(p.getKey() + " : " + p.getValue());
            if(p.getKey().equals(101)){
                p.setValue("Sia");
            }
        }
        System.out.println(s1);
     }
}
