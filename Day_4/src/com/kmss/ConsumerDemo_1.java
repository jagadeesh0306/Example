package com.kmss;

import java.util.function.Consumer;

public class ConsumerDemo_1 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Java");
	}
}
