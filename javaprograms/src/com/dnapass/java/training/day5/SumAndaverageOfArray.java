package com.dnapass.java.training.day5;

import java.util.Scanner;

public class SumAndaverageOfArray {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements you want to store");
		n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements");
			arr[i]=sc.nextInt();
		}
		System.out.println("the entering elements are");
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			
		}
      System.out.println(sum);
       float average=(float)sum/n;
      System.out.println("the average of elements:"+average);
	}

}