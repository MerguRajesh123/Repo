package com.dnapass.training.java.day5;

import java.util.Scanner;

public class PangramSentenceOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		s1=s1.replaceAll("","").toLowerCase();
		String s2="";
		for(char i='a';i<='z';i++)
		{
			if(s1.indexOf(i)!=-1)
			{
				s2=s2+i;
			}
		}
		if(s2.length()==26)
		{
			System.out.println("Pangram");
		}
		else
			System.out.println("Not Pangram");

	}

}