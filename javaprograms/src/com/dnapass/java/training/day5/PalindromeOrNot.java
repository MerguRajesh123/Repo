package com.dnapass.java.training.day5;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
	    String s2="";
	    for(int i=0;i<=s1.length()-1;i++)
	    {
	    	s2=s1.charAt(i)+s2;
	    }
	    System.out.println(s2);
       if(s2.equals(s1))
       {
    	   System.out.println("Yes");
       }
        else
            System.out.println("No");

	}
}
