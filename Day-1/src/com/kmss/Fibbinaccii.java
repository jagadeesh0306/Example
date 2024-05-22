package com.kmss;

//A Fibonacci Sequence is defined as follows: the first and second terms in the sequence are 0 and 1.
//Subsequent terms are found by adding the preceding two terms in the sequence.

public class Fibbinaccii {

	public static void main(String[] args) {
		int x = 0; 
		int y = 1; 
		System.out.println(x);
		System.out.println(y);
		int n = 8;
		for(int i=1; i<=n; i++)
		{
			int temp = y + x;
			x = y;
			y = temp;
			System.out.println(temp);
		}
	}
}
