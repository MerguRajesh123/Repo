package com.dnapass.java.training.day5;

import java.util.Scanner;

public class AllCharactersToLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		System.out.println(s2);

	}

}