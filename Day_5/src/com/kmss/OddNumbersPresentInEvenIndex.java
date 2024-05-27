package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OddNumbersPresentInEvenIndex {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		System.out.print("Odd Elements at Even Position : ");
		IntStream.range(0, li.size()).filter(f-> li.get(f)%2 != 0 && f%2 == 0).forEach((x)->{
			int i = li.get(x);
			System.out.print(i + " ,");
		});
	}
}
