package com.KMSS;

//write a function with arguments

public class FunctionsWithArguments {
	
	public static void main(String[] args) {
		
		Example e = new Example();
		int result = e.add(5, 2);
		System.out.println("Addition = " + result);
		int result1 = e.sub(7, 10);
		System.out.println("Difference = " + result1);	
	}
}

class Example{
	
public int add(int a, int b) {
		
		return a + b;
	}
	public int sub(int x, int y) {
		
		return x-y;
	}
}
