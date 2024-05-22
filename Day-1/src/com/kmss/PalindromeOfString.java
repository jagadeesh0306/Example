package com.kmss;

//Write a program to determine if the given string is a palindrome or not.

public class PalindromeOfString {

	public static void main(String[] args) {
		String s = "malayalam";
		String t = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			t = t + s.charAt(i);
		}
		System.out.println("Original String : " + s);
		System.out.println("Reverse String : " + t);
		if(s.equals(t))
		{
			System.out.println("Given String is Palindrome");
		}
		else
			System.out.println("Given String is Not palindrome");
	}
}
