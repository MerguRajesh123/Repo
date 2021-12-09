package com.dnapass.java.training.day5;

import java.util.Scanner;

public class ReturnModifiedString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer();
		if(s1.charAt(0)=='k')
		{
			if(s1.charAt(1)=='b')
			{
				sb.append(s1);
			}
			else
				sb.append(s1.charAt(0)).append(s1.substring(2));
		}
		else if(s1.charAt(1)=='b')
		{
			sb.append(s1.charAt(0)).append(s1.substring(2));
		}
		else
		{
			sb.append(s1.substring(2));
		}
    System.out.println(sb);
	}
}