package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class Driver {

	private final static Employee emp = new Employee("","","");
	private final static Scanner sc = new Scanner(System.in);
	
	public static void main( String args[]) {
		
		System.out.println("Hello there!! Please enter your First Name");
		emp.setFirstName(sc.next());
		
		System.out.println("Hello there!! Please enter your Last Name");
		emp.setLastName(sc.next());
		
		System.out.println("Choose the department");
		int choice = displayMenuAndGetChoice();
		
		String Dept = null;
		
		switch( choice ) 
		{
			case 1:
				Dept = "tech";
				break;
			case 2:
				Dept = "adm";
				break;
			case 3:
				Dept = "hr";
				break;
			case 4:
				Dept = "lg";
				break;
		}
		
		emp.setDepartment(Dept);
		
		CredentialsService cs = new CredentialsService();
		
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --> "+cs.generateEmailAddress(emp));
		System.out.println("Password --> "+cs.generateCredentials(emp));
		
		
		
		sc.close();
	}
	
	private static int displayMenuAndGetChoice()
	{
		System.out.println("-----------------------");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		System.out.println("------------------------");
		
		int ch = sc.nextInt();
		
		return ch;
	}

}
