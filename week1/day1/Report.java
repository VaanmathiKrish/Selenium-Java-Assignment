package week1.day1.assignment;

public class Report {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		// Assigning values
		String studentName = "Ilan";
		int rollNo = 356;
		String collegeName = "AIHT";
		int markScored = 590;
		float cgpa = 9.4f;
		
		// Calling student class method to display student details
		student.studentDetails(studentName, rollNo, collegeName, markScored, cgpa);
	}

}
