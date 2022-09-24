package org.list;

import java.util.List;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		
		List di=new Vector();
		
		List da = new Vector();
		
		da.add(23.987654);
		da.add("Siva");
		da.add(45);
		da.add(3.9867);
		da.add('V');
		da.add(129);
		
		System.out.println(da);
		
		di.add(23.987654);
		di.add("Siva");
		di.add(45);
		di.add(3.9867);
		di.add('S');
		di.add(129);
		
		System.out.println(di);
		
		int size = di.size();
		System.out.println(size);
		
		Object indexof = di.indexOf('S');
		System.out.println(indexof);
		
		Object lastindexof = di.lastIndexOf('S');
		System.out.println(lastindexof);
		
//		Object all = da.addAll(di);
//		System.out.println(da);
		
		Object rall = da.retainAll(di);
		System.out.println(da);
		
		Object rall1 = da.retainAll(di);
		System.out.println(di);
		
//		Object reall = di.removeAll(da);
//		System.out.println(da);
	
		boolean containss = di.contains(45);
		System.out.println(containss);
		
		System.out.println(di);
		System.out.println(da);
		
//		da.clear();
//		System.out.println(da);
//		
//		di.clear();
//		System.out.println(di);
		
		di.remove(2);
		System.out.println(di);
		
		Object f = di.get(3);
		System.out.println(f);
		

		
	}
	
}
