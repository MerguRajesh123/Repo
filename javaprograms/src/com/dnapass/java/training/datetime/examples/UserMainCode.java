package com.dnapass.java.training.datetime.examples;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserMainCode {
	public static int getNumberOfDays(int year,int month){
		GregorianCalendar gc=new GregorianCalendar(year,month,1);
		int days=gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		return days;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		
		System.out.println(getNumberOfDays(n1,n2));
	}
	}