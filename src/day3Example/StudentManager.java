package day3Example;

public class StudentManager {
	
	public void student(Student student)
	{
		
		System.out.println(student.studentNumber +" Numaral� ��renci "+ student.takenCourse +" Kursunu Alm��t�r.");
		
		
	}
	
	public void studentInfo(Student[] students)
	
	{
	
		for (Student student : students) {
		
			student(student);
		}
	}

}
