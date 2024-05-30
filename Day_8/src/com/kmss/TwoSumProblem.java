package com.kmss;


//Find the count of two elements in array . Target = 7;

public class TwoSumProblem {

	public static void main(String[] args) {
		int[] arr = {0, 1, -2, 3, 4, -5, 6, 7};
		int target = 7;
		int result = 0;
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i] + arr[j] == target && arr[i] !=0)
				{
					
					result++;
				}
			}
		}
		System.out.println("sets : " +result);
	}
}
