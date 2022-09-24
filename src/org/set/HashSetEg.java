package org.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEg {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(90);
		set.add(10);
		set.add(10);
		set.add(40);
		set.add(50);
		
		System.out.println(set);
		
		Set sett = new HashSet();
		sett.add(30);
		sett.add(40);
		sett.add(50);
		sett.add(60);
		sett.add(80);
		sett.add(90);
		
		System.out.println(sett);
		
		sett.addAll(set);
		System.out.println(sett);
		
		sett.removeAll(sett);
		System.out.println(sett);
		
		for (Object object : sett) {
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
//		int size = di.size();
//		System.out.println(size);
//		
//		boolean contain = di.contains(20);
//		System.out.println(contain);
//		
////		di.clear();
////		System.out.println(di);
//		
////		da.addAll(di);
////		System.out.println(da);
//		
////		da.remove(20);
////		System.out.println(da);
//		
//		System.out.println(di);
//		System.out.println(da);
//		
//		
////		da.removeAll(di);
////		System.out.println(da);
//		
//		di.retainAll(da);
//		System.out.println(di);	
//		
	
		
	}
	

}
