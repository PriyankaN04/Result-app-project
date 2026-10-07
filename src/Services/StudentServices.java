package Services;



import com.java.core.Entity.Student;
import com.java.core.Helper.OutputHelper;
import com.java.core.Repository.StudentRepository;

public class StudentServices {

	public void getStudentDetailsByName(String name) {
		Student[] allStudents = StudentRepository.getAllStudent();
		
		
		for(int i = 0 ; i < allStudents.length ; i++) {
			Student student = allStudents[i];
			
			if(student.Firstname.equals(name)) {
				OutputHelper.GetStudentdetails(student);	
			}
			
		}
		
	
	}
	
	public void getStudentDetailsByID(int id) {
		Student[] allStudents = StudentRepository.getAllStudent();
		
		
		for(int i = 0 ; i < allStudents.length ; i++) {
			Student student = allStudents[i];
			
			if(student.ID == id) {
				OutputHelper.GetStudentdetails(student);	
			}
			
		}
		
	
	}
	
	
	public void getAllStudentDetails() {
		
	Student[] allStudents = StudentRepository.getAllStudent();
	
	for(int i = 0 ; i < allStudents.length ; i++ ) {
		Student student = allStudents[i];
		OutputHelper.GetStudentdetails(student);
		
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
