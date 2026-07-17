package com.java.core.Main;

import java.util.Scanner;

import com.java.core.Entity.Student;
import com.java.core.Helper.OutputHelper;
import com.java.core.Repository.StudentRepository;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print details of Student:");
		String name = sc.next();

		StudentRepository Repository = new StudentRepository();
		OutputHelper Helper = new OutputHelper();

		

		switch (name) {
		case "Priyanka": {
            Student Priyanka = Repository.GetPriyankadetails();
			Helper.GetStudentdetails(Priyanka);
			break;
		}
		
		case "Nikhil" :{
			Student Nikhil = Repository.GetNikhildetails();
			Helper.GetStudentdetails(Nikhil);
			break;
		}
		
		case "Softy" :{
			Student Softy = Repository.GetSoftydetails();
			Helper.GetStudentdetails(Softy);
			break;
		}
		
		case "Pihu" :{
			Student Pihu = Repository.GetPihudetails();
			Helper.GetStudentdetails(Pihu);
			break;
		}
		
		case "Anu" :{
			Student Anu = Repository.GetAnudetails();
			Helper.GetStudentdetails(Anu);
			break;
		}
		
		case "Michael" :{
			Student Michael = Repository.GetMichaeldetails();
			Helper.GetStudentdetails(Michael);
			break;
		}
		
		case "John" :{
			Student John = Repository.GetJohndetails();
			Helper.GetStudentdetails(John);
			break;
		}
		
		case "Mike" :{
			Student Mike = Repository.GetMikedetails();
			Helper.GetStudentdetails(Mike);
			break;
		}
		
		case "Jack" :{
			Student Jack = Repository.GetJackdetails();
			Helper.GetStudentdetails(Jack);
			break;
		}
		
		case "Julie" :{
			Student Julie = Repository.GetJuliedetails();
			Helper.GetStudentdetails(Julie);
			break;
		}
		
		default:
			System.out.println("Please enter a proper name");
		}

	}
}
