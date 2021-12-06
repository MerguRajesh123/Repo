package com.dnapass.java.training.day2;

import java.util.Scanner;

public class PositiveOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0) {
			System.out.println(a+"is positive number");
		}else
			System.out.println(a+"is not a positive number");

	}

}
