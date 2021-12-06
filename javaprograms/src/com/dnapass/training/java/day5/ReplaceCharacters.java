package com.dnapass.training.java.day5;


import java.util.Scanner;

public class ReplaceCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2=s1.replace('d','h');
		System.out.println(s2);

	}

}
