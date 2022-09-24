package org.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEg {
	
	public static void main(String[] args) {
		
	Map <String,String> hashtable = new Hashtable();
	
	hashtable.put("vel", "selenium");
	hashtable.put("Ganesh", "Framework");
	hashtable.put("Dinesh", "Oracle");
	hashtable.put("venkat","corejava" );
	hashtable.put("subash", "jira");
	
	System.out.println(hashtable);
	System.out.println();
	
	Set<Entry<String,String>> hash = hashtable.entrySet();
	
	for (Entry<String, String> entry : hash) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		//System.out.println(entry.getClass());
	}
	
	
		
		
		
		
		
		
		
		
		
	}
	

}
