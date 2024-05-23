package com.KMSS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FunctionWithStudentObjectTest {

	@Test
	void test() {
		Student s = new Student("Nani","Java");
		String res =s.display();
		assertEquals("Nani"+ "\n" +"Java",res);
		System.out.println(res);
		
		
				
	}
}
