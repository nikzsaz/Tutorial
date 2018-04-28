package com.sample.test;
import java.util.*;

@SuppressWarnings("unchecked")
class Employee implements Comparable{
	int eid;
	String ename;
	
	Employee(int eid,String ename){
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int compareTo(Object o) {
		int eid1 = this.eid;
		Employee e = (Employee)o;
		int eid2 = e.eid;
		if(eid1  < eid2){
			return -1;
		}
		else if(eid1 > eid2){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return this.eid + " -> " + this.ename ; 
	}
	
}

@SuppressWarnings("unchecked")
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		String s1 = e1.ename;
		String s2 = e2.ename;
		
		return s1.compareTo(s2);
	}
	
}


public class ComparatorAndComparable {
	public static void main(String ...args){
		
	Employee e1 = new Employee(109,"nirajk");
	Employee e2 = new Employee(12,"ewfwr");
	Employee e3 = new Employee(113,"sdf");
	Employee e4 = new Employee(14,"zdfef");
	
	TreeSet t = new TreeSet();
	
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	
	System.out.println(t);
	
	// now i dont want to sort on the basis of id i want sorting on the basis of name
	// in that case i can use comparator
	
	TreeSet t1 = new TreeSet(new MyComparator());
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	
	System.out.println(t1);
	
	}
	
	
}
