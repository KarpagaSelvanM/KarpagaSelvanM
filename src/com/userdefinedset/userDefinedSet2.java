package com.userdefinedset;

import java.util.HashSet;
import java.util.Set;

public class userDefinedSet2 {
	public static void main(String[] args) {
		
		UserDefinedSet Emp1 = new UserDefinedSet();
		Emp1.setEmailId("2344");
		Emp1.setName("Vinoth");
		Emp1.setMobNo(9876456987l);
		Emp1.setAddress("23,rtyu,cvghuij,dfghjk-5679879");
		Emp1.setDob("34.98.8997");
		Emp1.setDoj("78.34.2899");
		Emp1.seteMail("drcfghj@tgyubh.com");
		Emp1.setGender("male");
		Emp1.setSalary(9087f);
        
		UserDefinedSet Emp2 = new UserDefinedSet();
		Emp2.setAddress("Srivi");
		Emp2.setDob("34.89.45676");
		Emp2.setDoj("67.456.366687");
		Emp2.seteMail("rtgbhn@vbhnj.com");
		Emp2.setEmailId("3456");
		Emp2.setGender("Female");
		Emp2.setMobNo(987652345l);
		Emp2.setName("Vinoth");
		Emp2.setSalary(5678f);

		Set<UserDefinedSet> details = new HashSet();
		details.add(Emp1);
		details.add(Emp2);
		
		for (UserDefinedSet user : details) {
			System.out.println(user.getAddress());
			System.out.println(user.getDob());
			System.out.println(user.getDoj());
			System.out.println(user.geteMail());
			System.out.println(user.getEmailId());
			System.out.println(user.getGender());
			System.out.println(user.getMobNo());
			System.out.println(user.getName());
			System.out.println(user.getSalary());
			System.out.println("*********");
		}
		
		//Result found
		
		
	}

}
