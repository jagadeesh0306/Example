package com.KMSS;

import java.util.Scanner;

//check if String is Palindrome

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		reverse(s);
	}
	
	public static String reverse(String s)
	{
		String  t = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			t = t + s.charAt(i);
		}
		System.out.println("Original String : " + s);
		System.out.println("Reverse String : " + t);
		if(s.equals(t))
		{
			System.out.println("Given String is palindrome");
		}
		else
			System.out.println("Given String is not palindrome");
		
		return s;
	}
}
