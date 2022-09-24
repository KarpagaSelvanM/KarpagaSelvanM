package org.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmapEg {
	
	public static void main(String[] args) {
		
		
		Map<Integer,Integer> linkedmap = new LinkedHashMap();
		
		linkedmap.put(10,10);
		linkedmap.put(20,20);
		linkedmap.put(30,30);
		linkedmap.put(40,40);
		linkedmap.put(50,50);
		linkedmap.put(60,10);
		linkedmap.put(70,50);
		linkedmap.put(80,40);
		
		System.out.println(linkedmap);
		System.out.println();
		
		Set<Entry<Integer,Integer>> value = linkedmap.entrySet();
		
		for (Entry<Integer, Integer> entry : value) {
			System.out.println();
			System.out.println(entry.getKey());
			System.out.println();
			System.out.println(entry.getValue());
			//System.out.println(entry.getClass());
			
		}
		
		
		
		
		
		
	}
	
	
	

}
