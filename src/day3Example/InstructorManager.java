package day3Example;

public class InstructorManager {

	public void instructorInfo(Instructor instructor)
	{
		
		System.out.println(instructor.certificate + " Sertifikalar�na sahiptir.");
		System.out.println(instructor.givenCourse +" Kurslar� y�klendi.");
		
	}
	
	public void instructor(Instructor[] instructors)
	{
		for (Instructor instructor : instructors) {
			
			instructorInfo(instructor);
		}
	}
	
}
