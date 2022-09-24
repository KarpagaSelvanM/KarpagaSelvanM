package org.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListEx {
	public static void main(String[] args) {
		
	Set gh = new TreeSet();
	
	gh.add(23);
	gh.add(34);
	gh.add(673563);
	gh.add(90);
	gh.add(56);
	gh.add(98);
	
	System.out.println(gh);
	
	for (Object gf : gh) {
		System.out.println(gf);
	}

		
	}
}
