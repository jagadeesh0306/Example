package com.kmss;

public class DisplayingSets {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int target = 5;
		int result = 0;
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i] + arr[j] == target)
				{
				
					System.out.print("[" + arr[i] + ",");
					System.out.print(arr[j]+"]");
					System.out.println(result++);
				}
			}
		}
		System.out.println("sets : "+result);
	}

}
