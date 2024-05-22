package com.kmss;

//Print numbers divisible by 7

public class Numbers_1 {

	public static void main(String[] args) {
		int n = 50;
		for(int i=1; i<=n; i++) {
			if(i%7 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
