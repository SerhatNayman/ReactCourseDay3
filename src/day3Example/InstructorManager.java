package day3Example;

public class InstructorManager {

	public void instructorInfo(Instructor instructor)
	{
		
		System.out.println(instructor.certificate + " Sertifikalarına sahiptir.");
		System.out.println(instructor.givenCourse +" Kursları yüklendi.");
		
	}
	
	public void instructor(Instructor[] instructors)
	{
		for (Instructor instructor : instructors) {
			
			instructorInfo(instructor);
		}
	}
	
}
