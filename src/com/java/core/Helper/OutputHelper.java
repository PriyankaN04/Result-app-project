package com.java.core.Helper;

import com.java.core.Entity.Student;
import com.java.core.Repository.StudentRepository;

public class OutputHelper {
	
	public static void GetStudentdetails(Student S) {

	
	System.out.println("ID = " +S.ID);
	System.out.println("First name = " +S.Firstname);
	System.out.println("Last name = " +S.Lastname);
	System.out.println("Age = " +S.Age);
	System.out.println("Maths marks = " +S.Mathsmarks);
	System.out.println("Science Marks" +S.Sciencemarks);
	System.out.println("English marks" +S.Englishmarks);

	System.out.println("===============================");
	}
}
