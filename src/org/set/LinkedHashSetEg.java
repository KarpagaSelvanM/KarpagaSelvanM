package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEg {
	
	public static void main(String[] args) {
		
		Set da = new LinkedHashSet();
		Set di = new LinkedHashSet();
		
		di.add(10);
		di.add(20);
		di.add(60);
		di.add(50);
		di.add(40);
		di.add(70);
		di.add(80);
		di.add(90);
		
		System.out.println(di);
		
		da.add(10);
		da.add(20);
		da.add(30);
		da.add(90);
		da.add(10);
		da.add(10);
		da.add(40);
		da.add(50);
		
		System.out.println(da);
		
		da.removeAll(di);
		System.out.println(da);
		
//		int size = da.size();
//		System.out.println(size);
		
//		di.addAll(da);
//		System.out.println(di);
//		
//		System.out.println(da);
//		System.out.println(di);
		
//		boolean contain = di.contains(35);
//		System.out.println(contain);
//		
//		di.clear();
//		System.out.println(di);
		
//		di.remove(30);
//		System.out.println(di);
		
//		di.removeAll(da);
//		System.out.println(di);
	
		
	}
	
	
	

}
