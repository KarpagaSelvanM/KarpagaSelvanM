package com.questionno7;

import java.util.HashSet;
import java.util.Set;

public class ChildClass {
	public static void main(String[] args) {
		
		ParentClass Std1 = new ParentClass();
		Std1.setAddress("ihugyfc");
		Std1.setDob("67.45.0987");
		Std1.seteMail("uyhgfvbn@fghj.com");
		Std1.setGender("male");
		
		Set<ParentClass> s = new HashSet();
		s.add(Std1);
		
		for (ParentClass Std : s) {
			System.out.println(Std.getAddress());
			System.out.println(Std.getDob());
			System.out.println(Std.geteMail());
			System.out.println(Std.getGender());
			System.out.println(Std.getStdId());
			System.out.println(Std.getStdMob());
			System.out.println(Std.getStdName());
		}
		
	}

}
