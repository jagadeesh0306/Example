package com.kmss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Map {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "python", "machine learnng", "big data");
		List<String> wordsInUpperCase = new ArrayList<String>();
		
		/* for(String name : words)
		{
			wordsInUpperCase.add(name.toUpperCase());
		}
		System.out.println(wordsInUpperCase); */
		
		wordsInUpperCase = words.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(wordsInUpperCase);
 
	}
}
