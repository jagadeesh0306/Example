package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DivisibleBy2 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		IntStream.range(0, li.size()).filter(x -> li.get(x)%3==0).forEach((i) -> {
			Integer n  = li.get(i);
			System.out.println(n);
		});
	}
}
