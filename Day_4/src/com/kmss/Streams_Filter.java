package com.kmss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Filter {

	public static void main(String[] args) {
		/* ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(20);
		numbersList.add(25);
		numbersList.add(30); */
		
		List<Integer>numberList = Arrays.asList(10, 15, 20, 25, 30);
		List<Integer>evenNumberList = new ArrayList<Integer>();
		
		//witout using streams
		
		/*for(int n : numberList)
		{
			if(n%2==0)
			{
				evenNumberList.add(n);
			}
		}
		System.out.println(evenNumberList);*/
		
		//with using streams
		
		/*evenNumberList = numberList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(); */
		
		//numberList.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		numberList.stream().filter(n -> n%2==0).forEach(System.out::println);
	}
}
