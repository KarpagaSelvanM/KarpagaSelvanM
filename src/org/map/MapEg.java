package org.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapEg {

	public static void main(String[] args) {
		
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the Employee Name :");
		String name = sd.nextLine();
		System.out.println(name);
		System.out.println("Enter the Employee ID :");
		String id = sd.next();
		System.out.println(id);
		System.out.println("Enter the Mob no :");
		String mobno = sd.next();
		System.out.println(mobno);
		sd.nextLine();
		System.out.println("Enter the Address :");
		String address = sd.nextLine();
		System.out.println(address);
		System.out.println("Enter the DOB :");
		String dob = sd.next();
		System.out.println(dob);
		System.out.println("Enter the DOJ :");
		String doj = sd.next();
		System.out.println("Enter the mailid :");
		String mailid = sd.next();
		System.out.println(mailid);
		System.out.println("Ente the Gender :");
		String gender = sd.next();
		System.out.println(gender);
		System.out.println("Enter the current CTC :");
		String salary = sd.next();
		System.out.println(salary);
		
		System.out.println();
		
		List be = new ArrayList();
		be.add(name);
		be.add(mailid);
		
		
		Map<String,String> empdetails = new TreeMap();
		
		empdetails.put("Employee Name ", name);
		empdetails.put("Employee ID ", id);
		empdetails.put("Mobile No ", mobno);
		empdetails.put("Employee Address ", address);
		empdetails.put("Employee Date of Birth ", dob);
		empdetails.put("Date of joining ", doj);
		empdetails.put("Mail ID ", mailid);
		empdetails.put("Gender" , gender);
		empdetails.put("Current CTC ", salary);
		
		System.out.println(empdetails);
		
		Set<Entry<String,String>> EmployeeDetails = empdetails.entrySet();
		
		for (Entry<String, String> EmployeeUpdatedDetails : EmployeeDetails) {
			
			System.out.println(EmployeeUpdatedDetails.getKey());
			System.out.println(EmployeeUpdatedDetails.getValue());
		}
		
		
	}
	
	
}
