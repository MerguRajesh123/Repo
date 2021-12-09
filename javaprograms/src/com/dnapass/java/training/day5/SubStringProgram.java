package com.dnapass.java.training.day5;

import java.util.Scanner;

public class SubStringProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(s1.substring(start,end));

	}

}