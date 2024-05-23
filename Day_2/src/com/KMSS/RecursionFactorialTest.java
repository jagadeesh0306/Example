package com.KMSS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionFactorialTest {

	@Test
	void test() {
		RecursiveFactorial r = new RecursiveFactorial();
		int result = r.factorial(5);
		assertEquals(120, result);
		System.out.println("Factorial of given number : "+result);	
	}
}
