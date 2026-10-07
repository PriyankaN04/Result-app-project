package com.java.core.Main;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import com.java.core.Entity.Student;
import com.java.core.Helper.OutputHelper;
import com.java.core.Repository.StudentRepository;

import Services.StudentServices;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("!!Welcome to result application!!");
		System.out.println("Please select option from below");
		System.out.println("1. Get student details by name");
		System.out.println("2.GetField studentField details by ID");
		System.out.println("3.. Get all student details");
		
		System.out.println("Please enter the option number");
		int value = sc.nextInt();
		System.out.println("Selected option is : " +value);
		
		StudentServices service = new StudentServices();
		
		
		
		switch (value) {
		case 1: {
			//value = 1 -> Option 1
			System.out.println("Enter name of Student:");
			String name = sc.next();
			sc.close();
			//1. get student details by name
			service.getStudentDetailsByName(name);
			
			break;
		}
		
		case 2: {
			//value = 2 -> Option 2
			System.out.println("Enter ID of Student:");
			int id = sc.nextInt();
			sc.close();
			//1. get student details by ID
			service.getStudentDetailsByID(id);
			
			break;
		}
		
		
		case 3:{
			//value = 3 -> Option 3
			//3. get all student details
			service.getAllStudentDetails();
			
			break;
		}
		default:
			System.err.println("Unexpected value: " + value);
		}
		
	
	
		
		
		
		
		
		
	}
}
