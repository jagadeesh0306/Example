package com.kmss;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Generating1T010Numbers {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 6, -9, 19);

		IntStream.range(0, li.size()).filter(x -> (x)>0).forEach((System.out::println));
		/*-> {
			
			//Integer num = li.get(index);
			//System.out.println();
		});

	//	IntStream.range(1, 11).forEach(System.out::println);

	}*/
}
}
