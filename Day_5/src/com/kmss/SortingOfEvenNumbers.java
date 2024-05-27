package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingOfEvenNumbers {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 3, 4, 2, 27, 18, 6, 12, 19, 31);
		
		li.stream().filter(f-> f%2==0).sorted().forEach(System.out::println);
	}
}
