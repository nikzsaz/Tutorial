package com.sample.test;
import java.util.*;

@SuppressWarnings("unchecked")
class Employee implements Comparable{
	int eid;
	String ename;
	int  salary;
	
	Employee(int eid,String ename,int salary){
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
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
		return this.eid + " -> " + this.ename + " -> " + this.salary; 
	}
	
}

@SuppressWarnings("unchecked")
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		int id1 = e1.eid;
		int id2 = e2.eid;
		
		String s1 = e1.ename;
		String s2 = e2.ename;
		
		int salary1 = e1.salary;
		int salary2 = e2.salary;
		
		int compareStringValue = 0;
		
		if(id1 < id2){
			return -1;
		}else if(id1 > id2){
			return +1;
		}else{
			compareStringValue = s1.compareTo(s2);
			if(compareStringValue != 0){
				return compareStringValue;
			}else{
				if(salary1 < salary2){
					return -1;
				}else if(salary1 > salary2){
					return +1;
				}else {
					return 0;
				}
			}
		}
	}
	
}


public class Comparator3LevelComp {
	public static void main(String ...args){
		
	Employee e1 = new Employee(109,"nirajk",10010);
	Employee e2 = new Employee(12,"ewfwr",13132);
	Employee e3 = new Employee(113,"sdf",23423);
	Employee e4 = new Employee(12,"ewfwr",23223);
	
	
	TreeSet t1 = new TreeSet(new MyComparator());
	
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	
	System.out.println(t1);
	
	}
	
	
}
