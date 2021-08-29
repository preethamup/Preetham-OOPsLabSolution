package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialsService {
	
	private String password = null;
	private String emailAddress = null;
	
	public String generateCredentials(Employee emp)
	{
		String allPossibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()";
		Random rn = new Random();
		password = "";
		for(int i=0;i<8;i++)
		{
			password = password+allPossibleCharacters.charAt(rn.nextInt(allPossibleCharacters.length()));
		}
		
		return password;
	}
	
	public String generateEmailAddress(Employee emp)
	{
		emailAddress = emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartment()+".abc.com";
		return emailAddress;
	}

}
