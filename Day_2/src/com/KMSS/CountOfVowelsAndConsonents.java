package com.KMSS;

import java.util.Scanner;

//count number of vowels and consonants in a String

public class CountOfVowelsAndConsonents 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		word(s);
	}
	public static String word(String s)
	{
		int Vowelcount = 0;
		int consonentcount = 0;
		//String s = "jagadeesh";
		for(int i=0; i<=s.length()-1; i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'
					|| s.charAt(i)=='u')
			{
				Vowelcount ++;
			}
			else
				consonentcount++;	
		}
		System.out.println("Vowels : "+Vowelcount);
		System.out.println("consonents : " +consonentcount);
		
		return Vowelcount + "/n" + consonentcount;
	}
}
