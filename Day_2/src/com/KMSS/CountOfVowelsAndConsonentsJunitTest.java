package com.KMSS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountOfVowelsAndConsonentsJunitTest {

	@Test
	void test() {
		CountOfVowelsAndConsonents c = new CountOfVowelsAndConsonents();
		String s = c.word("jagadeesh");
		assertEquals(4 +"/n"+ 5 , s);
		System.out.println(s);
	}
}
