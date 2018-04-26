import java.util.*;

public class TreeSetDemo{

     public static void main(String []args){
        TreeSet t = new TreeSet();
        t.add("A"); //65
        t.add("a"); // 97
        t.add("B");
        t.add("Z");
        t.add("L");
        //t.add(new Integer(12)); class cast exception
        System.out.println(t);
        
       // TreeSet t1 = new TreeSet();
        //t1.add(null);
        //
        
        //System.out.println(t1);// till 1.6 it will not throw exception
        // but after 1.6 it is not valid, there is no existance of null
        
       /* TreeSet t2 = new TreeSet();
        t2.add(new StringBuffer("A"));
        t2.add(new StringBuffer("M"));
        t2.add(new StringBuffer("B"));
        t2.add(new StringBuffer("Z"));
        System.out.println(t2); // this will cause class cast exception since
        // the element needs to be homogeneous and comparable. 
        // String Buffer not implment Comprable so such exception
     }
}
