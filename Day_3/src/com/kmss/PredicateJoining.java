package com.kmss;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Predicate<Integer> p1 = i -> i%2 == 0;
		Predicate<Integer> p2 = i -> i > 6;
		// and
		System.out.println("Even elements greater than 6 : ");
		for(int n : a)
		{
			//if(p1.test(n) && p2.test(n)))
			if(p1.and(p2).test(n))
			{
				System.out.print(n + ", ");
			}
		}
		System.out.println();
		//or
		System.out.println("Even numbers with even numbers greater than 6 : ");
		for(int n : a)
		{
			if(p1.or(p2).test(n))
			{
				System.out.print(n + ", ");
			}
		}
		System.out.println();
		//negation
		System.out.println("Elements which are not even and not greater than 6 : ");
		for(int n : a)
		{
			if(p1.negate().test(n))
			{
				System.out.print(n + ", ");
			}
		}
	}
}
