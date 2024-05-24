package com.kmss;

import java.util.function.Predicate;

public class PredicateDemo_1 {

	public static void main(String[] args) {
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(5));
		
		//check the length of given String is greater tan 4 or not
		
		Predicate<String> pr = s->(s.length()>4);
		System.out.println(pr.test("Hi"));
	}
}
