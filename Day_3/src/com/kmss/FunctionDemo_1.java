package com.kmss;

import java.util.function.Function;

public class FunctionDemo_1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f = n -> n * n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(2));
		
		// String length
		
		Function<String, Integer> fun = s -> s.length();
		System.out.print("Length of welcome : ");
		System.out.println(fun.apply("welcome"));
		
		System.out.print("Length of java program : ");
		System.out.println((fun.apply("java program")));

	}

}
