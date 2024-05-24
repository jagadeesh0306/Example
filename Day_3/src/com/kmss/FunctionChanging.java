package com.kmss;

import java.util.function.Function;

public class FunctionChanging {

	public static void main(String[] args) {
		
		/* Function changing
		 * andThen()--> f1() will execute first and return some value to f2(), then f2() will execute
		 * compose()-->f2() will execute first and return some value to f1(), then f1() will execute.
		 */
		
		Function<Integer, Integer> f1 = n -> n*2;
		Function<Integer, Integer> f2 = n -> n*n*n;
		
		System.out.print("f2 value : ");
		System.out.println(f1.andThen(f2).apply(2));
		
		System.out.print("f1 value : ");
		System.out.println(f1.compose(f2).apply(2));		
	}
}
