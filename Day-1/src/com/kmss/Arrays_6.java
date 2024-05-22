package com.kmss;

//Copy elements from one array to another array.

public class Arrays_6 {

	public static void main(String[] args) {
		int[] arr1 = {2, 5, 8, 1, 10};
		int[] arr2 = new int[arr1.length];
		System.out.println("arr1 Elements : ");
		for(int i=0; i<=arr1.length-1; i++)
		{
			arr2[i] = arr1[i];
			System.out.println(arr1[i]);
		
		}
		System.out.println("arr2 Element:");
		for(int i=0; i<=arr2.length-1; i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
