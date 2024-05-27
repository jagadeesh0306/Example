package com.kmss;

import java.util.Arrays;
import java.util.List;

public class SortingArrayELements {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 3, 4, 2, 27, 18, 6, 12, 19, 31);
		System.out.println("Sorted Elements :");
		li.stream().sorted().forEach(System.out::println);
	}
}
