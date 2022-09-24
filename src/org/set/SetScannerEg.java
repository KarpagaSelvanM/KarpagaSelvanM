package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetScannerEg {
	
	private void employeeInfo(int studentId, String studentName, String classStudying, 
			String address, long dob, String mailaddress, String gender) {
		
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(classStudying);
		System.out.println(address);
		System.out.println(dob);
		System.out.println(mailaddress);
		System.out.println(gender);
	}
	
	
	public static void main(String[] args) {
		
	Scanner studentdetails = new Scanner(System.in);
	
	System.out.println("Enter the Student Name :");
	String name = studentdetails.nextLine();
	System.out.println(name);
	System.out.println("Enter the Student ID :");
	int id = studentdetails.nextInt();
	System.out.println(id);
	System.out.println("Enter the Class Studying :");
	String classstudying = studentdetails.next();
	System.out.println(classstudying);
	studentdetails.nextLine();
	System.out.println("Enter the Address");
	String address = studentdetails.nextLine();
	System.out.println(address);
	System.out.println("Enter the DOB");
	int dob = studentdetails.nextInt();
	System.out.println(dob);
	System.out.println("Enter the e-mail id :");
	String mailid = studentdetails.next();
	System.out.println("Enter the Gender :");
	String gender = studentdetails.next();
	System.out.println(gender);
	
	System.out.println();
	
	SetScannerEg obj = new SetScannerEg();
	obj.employeeInfo(id, name, classstudying, address, dob, mailid, gender);

	
	System.out.println();
	
	Set studentdetail = new LinkedHashSet();
	studentdetail.add(name);
	studentdetail.add(id);
	studentdetail.add(classstudying);
	studentdetail.add(address);
	studentdetail.add(dob);
	studentdetail.add(mailid);
	studentdetail.add(gender);
	studentdetail.add(gender);
	
	System.out.println(studentdetail);
	
	System.out.println();
	
	for (Object finaliseddetail : studentdetail) {
		System.out.println(finaliseddetail);
		
		
	}
	
	
			
		
	}

}
