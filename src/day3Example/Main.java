package day3Example;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.id =1;
		student.firstName="Serhat";
		student.lastName="Nayman";
		student.studentNumber=7;
		student.takenCourse="Java-React";
		student.email="serhatnayman@gmail.com";
		
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.givenCourse="Java-React";
		instructor.certificate="PMP & MCT";
		instructor.email="engindemirog@gmail.com";
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student};
		studentManager.studentInfo(students);
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor[] instructors = {instructor};
		instructorManager.instructorInfo(instructor);
		
		UserManager userManager = new UserManager();
		User[] users = {student,instructor};
		userManager.user(users);

	}

}
