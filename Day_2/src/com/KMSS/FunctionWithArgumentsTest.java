package com.KMSS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FunctionWithArgumentsTest {

	@Test
	void test() {
		Example e = new Example();
		int result1 = e.add(5, 2);
		assertEquals(7, result1);
		System.out.println("Addition : " + result1);
		
		int result2 = e.sub(7, 10);
		assertEquals(-3, result2);
		System.out.println("difference : " + result2);
	}
}
