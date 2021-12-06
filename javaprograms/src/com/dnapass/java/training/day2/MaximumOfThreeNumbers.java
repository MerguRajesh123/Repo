package com.dnapass.java.training.day2;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(a>b&&a>c?a+"is max":b>c?b+"is max":c+"is maximum");
	}

}
