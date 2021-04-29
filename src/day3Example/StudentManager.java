package day3Example;

public class StudentManager {
	
	public void student(Student student)
	{
		
		System.out.println(student.studentNumber +" Numaralı Öğrenci "+ student.takenCourse +" Kursunu Almıştır.");
		
		
	}
	
	public void studentInfo(Student[] students)
	
	{
	
		for (Student student : students) {
		
			student(student);
		}
	}

}
