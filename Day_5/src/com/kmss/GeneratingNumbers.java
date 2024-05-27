package com.kmss;

import java.util.stream.IntStream;

public class GeneratingNumbers {

	public static void main(String[] args) {
		IntStream.range(1, 11).forEach(System.out::println);
	}
}
