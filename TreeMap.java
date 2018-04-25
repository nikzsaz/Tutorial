import java.util.*;

// TreeMap -> Reb Black Tree
// insertion on sorting order of keys
// duplicate keys are not allowed but values allowed
//if we are depending on default natural sorting order then keys should be
//   homogeneous and comparable
// if we are defining our own sorting by comparator then the keys need not
// to be homogeneous and comparable

// funda of null acceptance

// t.put(null,"z"); since comparision is required for entering into the 
// map so comparision with null cause null pointer exception

// if t.put(null,"z") for the first time will be allowed and when we
// try to insert another element then it will cause null pointer expcetion

// rull is applicable until JDK 1.6

// after that no such scenario is applicable with null, means null is not 
//allowed for key

class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}

public class HelloWorld{

     public static void main(String []args){
       TreeMap t = new TreeMap(); // Default natural sorting order of keys     
       TreeMap t1 = new TreeMap(new MyComparator()); // Customized sorting order
       //TreeMap t2 = new TreeMap(Map m); //For given map can you please create treemap
       //TreeMap t3 = new TreeMap(SortedMap m); //for any sorted map creatre the equivalent treemap
       
       t.put(100,"Nikki");
       t.put(103,"Mikki");
       t.put(99,"Lucki");
       t.put(104,106);
       //t.put("bz",234); // class cast exception
       //t.put(null,454); // null pointer exception8
       System.out.println(t);
       
       t1.put("xx",234);
       t1.put("nik",345);
       t1.put("ac",45);
       
       System.out.println(t1);
       
       // methods
       System.out.println(t1.firstKey());
       System.out.println(t1.lastKey());
       System.out.println(t1.size());
       System.out.println(t.headMap(103));
       System.out.println(t.tailMap(103));
       System.out.println(t.subMap(100,104));
     }
}
