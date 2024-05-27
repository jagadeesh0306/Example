package com.kmss;

import java.util.Arrays;
import java.util.List;

public class SumOfGivenElements {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		//sum
		int sum = li.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of Array Elements : "+sum);
		
		//average
		double avg = li.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("Average of Array Elements : "+avg);
	}
}