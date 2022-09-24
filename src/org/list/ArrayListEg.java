package org.list;


import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,10,25,35,25,20,89};
		
		List ding = new ArrayList();

		
		for (int dong:a) {
			System.out.println(ding.add(dong));
		
		}
		
		
		
		System.out.println();
		
		System.out.println(ding);
		
		
		List da = new ArrayList();
		List di = new ArrayList();
		
		
		di.add(100);
		di.add(10);
		di.add(10);
		di.add(10);
		di.add(200);
		di.add(300);
		di.add(50);
		
		da.add(10);
		da.add(45);
		da.add(10);
		//da.add(12);
		da.add(10);
		da.add(30);
		da.add(22);
		
		System.out.println(di);
		System.out.println(da);
		
		da.addAll(di);
		System.out.println(da);
		
		da.removeAll(da);
		System.out.println(da);
	

		di.removeAll(di);
		System.out.println(di);
		
		System.out.println(di);
		System.out.println(da);
		
		di.retainAll(da); //if common values present two times means two time will be printed
		System.out.println(di);
		
	
	}

		
	}


