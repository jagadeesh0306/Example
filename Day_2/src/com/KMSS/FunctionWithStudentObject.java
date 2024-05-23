package com.KMSS;

//write a function to take student object and print it.

class Student
{
	
	String sname;
	String course;
	public Student(String sname, String course)
	{
		
		this.sname = sname;
		this.course = course;
	}	
	public String display()
	{
		System.out.println(sname);
		System.out.println(course);
        return sname + "\n" + course;
	}
}

public class FunctionWithStudentObject {

	public static void main(String[] args) {
		
		Student s1 = new Student("Nani","Java");
		
		s1.display();
		
	}
}
