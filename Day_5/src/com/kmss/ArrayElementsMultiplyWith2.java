package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayElementsMultiplyWith2 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
		
		List<Integer> i  = li.stream().filter(f->f%2==0).map(m->m*2).collect(Collectors.toList());
		System.out.println(i);
	}
}
