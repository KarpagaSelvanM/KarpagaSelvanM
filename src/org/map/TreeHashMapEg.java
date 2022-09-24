package org.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeHashMapEg {
	
	public static void main(String[] args) {
		
		Map<Character,Integer> treehashmap = new TreeMap();
		
		treehashmap.put('&', 10);
		treehashmap.put('!', 20);
		treehashmap.put('@', 30);
		treehashmap.put('#', 40);
		treehashmap.put('$', 50);
		treehashmap.put('%', 60);
		treehashmap.put('^', 10);
		treehashmap.put('*', 50);
		treehashmap.put('(', 40);
		treehashmap.put('&', 10); //duplicated not allowed
		
		System.out.println(treehashmap);
		
		System.out.println();
		
		Set<Entry<Character,Integer>> value = treehashmap.entrySet();
		
		for (Entry<Character, Integer> entry : value) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			//System.out.println(entry.getClass());
						
		}
		
		
	}
	
	

}
