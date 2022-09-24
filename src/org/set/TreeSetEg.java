package org.set;


import java.util.TreeSet;

public class TreeSetEg {
	
public static void main(String[] args) {
	
	TreeSet di = new TreeSet();  //only similar data types we can store in TreeSet
	TreeSet da = new TreeSet();
	
	da.add(10);
	da.add(20);
	da.add(30);
	da.add(40);
	da.add(50);
	da.add(60);
	da.add(70);
	da.add(80);
				
	System.out.println(da);
	
	di.add(100);
	di.add(10);
	di.add(200);
	di.add(300);
	di.add(400);
	di.add(500);
	di.add(600);
	di.add(700);
	di.add(8000);
	
	System.out.println(di);
	
	int size = di.size();
	System.out.println(size);
	
	di.retainAll(da);
	System.out.println(di);
	
//	di.clear();
//	System.out.println(di);
	
//	boolean contains = di.contains(34);
//	System.out.println(contains);
//	
//	di.remove(2);
//	System.out.println(di);
//	
//	System.out.println(da);
//	
////	di.removeAll(di);
////	System.out.println(di);
//	
//	di.retainAll(da);
//	System.out.println(da);
	
	
		
	
}	
	
		
	}	
		
	


