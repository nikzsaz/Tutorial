import java.util.*;

public class HashMap{

     public static void main(String []args){
         Map<Integer,String> m = new HashMap<Integer,String>();
         
         System.out.println(m.put(101,"Hello"));
         System.out.println(m.put(102,"Mikki"));
         System.out.println(m.put(101,"Nikki"));
         System.out.println(m.put(103,"Sazzie"));
         
         // m.putAll
         System.out.println("--------------------------");
         System.out.println(m.get(101));
         System.out.println(m.get(102));
         
         //m.remove(key) will remove the entry
         System.out.println(m.remove(103));
         
         System.out.println("---------------------------");
         
         System.out.println(m.containsKey(101));
         System.out.println(m.containsKey(103));
         
         System.out.println("---------------------------");
         
         System.out.println(m.containsValue("Hello"));
         System.out.println(m.containsValue("Mikki"));
         
         System.out.println("---------------------------");
         
         System.out.println(m.isEmpty());
         System.out.println("---------------------------");
         System.out.println(m.size());
         System.out.println("---------------------------");
         m.clear();
         System.out.println(m.size());
     }
}
/* HashMap internally implement HashTable -> uses the concept of Hashing
*          HashMap                |     HashTable
*  Not Synchronized               |     Synchronized
*  Not thread safe                |     thread safe
*  High performance               |     Low performance
*  Null is allowed for key        |  Nothing like null
*  and value                      |
* Introduced in 1.2 JDK           | Introduced in 1.0 So legacy
*/
