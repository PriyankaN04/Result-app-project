package com.java.core.Repository;

import com.java.core.Entity.Student;

public class StudentRepository {

	public static Student[] getAllStudent() {

		Student S = new Student();
		S.ID = 101;
		S.Firstname = "Priyanka";
		S.Lastname = "Satav";
		S.Age = 28;
		S.Mathsmarks = 85;
		S.Sciencemarks = 90;
		S.Englishmarks = 88;

		Student S1 = new Student();
		S1.ID = 102;
		S1.Firstname = "Nikhil";
		S1.Lastname = "Satav";
		S1.Age = 29;
		S1.Mathsmarks = 80;
		S1.Sciencemarks = 78;
		S1.Englishmarks = 90;

		Student S2 = new Student();
		S2.ID = 103;
		S2.Firstname = "Softy";
		S2.Lastname = "Satav";
		S2.Age = 1;
		S2.Mathsmarks = 99;
		S2.Sciencemarks = 98;
		S2.Englishmarks = 95;

		Student S3 = new Student();
		S3.ID = 104;
		S3.Firstname = "Pihu";
		S3.Lastname = "Rathod";
		S3.Age = 6;
		S3.Mathsmarks = 90;
		S3.Sciencemarks = 80;
		S3.Englishmarks = 70;

		Student S4 = new Student();
		S4.ID = 105;
		S4.Firstname = "Anu";
		S4.Lastname = "Rathod";
		S4.Age = 55;
		S4.Mathsmarks = 70;
		S4.Sciencemarks = 70;
		S4.Englishmarks = 75;

		Student S5 = new Student();
		S5.ID = 106;
		S5.Firstname = "Michael";
		S5.Lastname = "Thompson";
		S5.Age = 30;
		S5.Mathsmarks = 75;
		S5.Sciencemarks = 80;
		S5.Englishmarks = 95;

		Student S6 = new Student();
		S6.ID = 107;
		S6.Firstname = "John";
		S6.Lastname = "Wick";
		S6.Age = 30;
		S6.Mathsmarks = 85;
		S6.Sciencemarks = 80;
		S6.Englishmarks = 98;

		Student S7 = new Student();
		S7.ID = 108;
		S7.Firstname = "Mike";
		S7.Lastname = "Cooper";
		S7.Age = 30;
		S7.Mathsmarks = 78;
		S7.Sciencemarks = 90;
		S7.Englishmarks = 75;

		Student S8 = new Student();
		S8.ID = 109;
		S8.Firstname = "Jack";
		S8.Lastname = "Mills";
		S8.Age = 45;
		S8.Mathsmarks = 86;
		S8.Sciencemarks = 74;
		S8.Englishmarks = 80;

		Student S9 = new Student();
		S9.ID = 106;
		S9.Firstname = "Julie";
		S9.Lastname = "Winter";
		S9.Age = 25;
		S9.Mathsmarks = 74;
		S9.Sciencemarks = 75;
		S9.Englishmarks = 80;

		Student[] studentArray = { S, S1, S2, S3, S4, S5, S6, S7, S8, S9 };

		return studentArray;
	}

}
