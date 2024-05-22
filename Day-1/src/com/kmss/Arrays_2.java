package com.kmss;

//Cyclically Permute the Elements of an Array
public class Arrays_2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int first = arr[0];
		int start = 0;
		
		for(int i=1; i<arr.length; i++)
		{
			arr[start++] = arr[i];
			
			arr[i] = first;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
