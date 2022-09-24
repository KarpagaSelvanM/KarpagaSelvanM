package org.map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEg {
	
	public static void main(String[] args) {
		
		Map<Integer,String> values = new HashMap();
		
		Map<Integer,String> valuess = new HashMap();
		
		valuess.put(10, "GH");
		
		valuess.putAll(values);
		System.out.println(valuess);
		
		System.out.println();
		
		values.put(10, "java");
		values.put(20, "sql");
		values.put(30, "oops");
		values.put(40, "Sql");
		values.put(50, "Oracle");
		values.put(60, "DB");
		values.put(10, "selenium" );
		values.put(20, "psql");
		values.put(40, "Handoop");
		
//		System.out.println(values);
		
		
		Object v = values.get(10);
		
		
		Collection getkeys =  values.keySet();
		System.out.println(getkeys);
		
//		Set<Integer> getkeys =  values.keySet();
//		System.out.println(getkeys);
//		
		System.out.println();
		
		Set<java.util.Map.Entry<Integer, String>> value = values.entrySet();
	
		for (java.util.Map.Entry<Integer, String> g : value) {
			System.out.println(g.getKey());
			System.out.println(g.getValue());
			//System.out.println(entry.getClass());
			
		}
	
		
	}
}
	


