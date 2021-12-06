package com.dnapass.java.training.Exceptions;

import java.util.*;
public class ExceptionDivBy0 {
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		try {
			num = num1/num2;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		System.out.println(num);
		sc.close();
		
	}
}