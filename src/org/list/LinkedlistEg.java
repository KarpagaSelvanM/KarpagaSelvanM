package org.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistEg {
	private static Object S;

	private static Object sasi;

	public static void main(String[] args) {
		
		//10,Yogi,95.88,true,s
		

       List listed = new LinkedList();
       List li = new LinkedList();
       
       li.add(12);
       li.add("Selvah");
       li.add(95.99);
       li.add('S');
       li.add(9.98765);
       li.add('S');
       
       System.out.println(li);
      
       listed.add(10);
       listed.add("Yogi");
       listed.add(95.88);
       listed.add(true);
       listed.add('S');
       listed.add('S');
       
       System.out.println(listed);
       
      Object size = listed.size();
      
	  System.out.println(size);
	  
	 Object Get = listed.get(4);
	 System.out.println(Get);
	 
	 Object remove = listed.remove(2);
	 System.out.println(remove);
	 
	 System.out.println(listed);
	 
	  listed.set(0,'E');
	  System.out.println(listed);
	 
	 boolean contains = listed.contains('X');
	 System.out.println(contains);
	 
	//listed.clear();
	 
	 System.out.println(listed);
	 
	 Object l = listed.indexOf(9);
	 System.out.println(l);
	 
	Object n = listed.lastIndexOf(90);
	System.out.println(n);
	
	System.out.println(listed);
	
	listed.addAll(li);
	System.out.println(listed); 
	 
	listed.removeAll(li);
	System.out.println(listed);
	
	listed.retainAll(listed);
	System.out.println(li);
	
		
	}
	

}
