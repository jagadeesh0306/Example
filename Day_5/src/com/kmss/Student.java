package com.kmss;

//comparable and comaparator in java

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student implements Comparable<Student>
{

	private String name;
	 private int age;
	 
	 public Student(String name, int age)
	 {
		 this.name = name;
		 this.age = age;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 
	@Override
	public int compareTo(Student other) {
		
		return Integer.compare(this.age, other.age);
	}
	
	public static void main(String[] args)
	{
		List<Student> s = Arrays.asList(
				 						 new Student("Nani", 20),
				 						 new Student("Viraj", 22),
				 						 new Student("Arjun", 18)
									   );
		//sort student by using streams
		List<Student> sortedStudent = s.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
		
		//print sorted students
		sortedStudent.forEach(student-> 
							System.out.println(student.getName() + ", "+ student.getAge()));
		 
	}
}
