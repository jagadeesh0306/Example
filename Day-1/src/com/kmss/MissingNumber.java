package com.kmss;

//identify missing Numbers in a given Array

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 7, 8, 2, 9, 4, 10};
		int n = arr.length+1;
		int sum = (n*(n+1))/2;
		for(int i=0; i<=arr.length-1; i++)
		{
			sum = sum - arr[i];
		}
		System.out.println("Missing Number in given Array : "+sum);
	}
}
