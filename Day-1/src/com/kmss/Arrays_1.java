package com.kmss;

import java.util.Scanner;

//Print elements at even index in array

public class Arrays_1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i =0; i<=arr.length-1; i++)
		{
			if((i%2 == 0) && (i>0))
			{
				System.out.println(arr[i]);
			}
		}
	}
}
