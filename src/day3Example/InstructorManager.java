package day3Example;

public class InstructorManager {

	public void instructorInfo(Instructor instructor)
	{
		
		System.out.println(instructor.certificate + " Sertifikalarýna sahiptir.");
		System.out.println(instructor.givenCourse +" Kurslarý yüklendi.");
		
	}
	
	public void instructor(Instructor[] instructors)
	{
		for (Instructor instructor : instructors) {
			
			instructorInfo(instructor);
		}
	}
	
}
