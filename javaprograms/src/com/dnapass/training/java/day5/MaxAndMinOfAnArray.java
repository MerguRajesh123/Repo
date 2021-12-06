package com.dnapass.training.java.day5;


import java.util.Scanner;

public class MaxAndMinOfAnArray {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements");
			arr[i]=sc.nextInt();
		}
		System.out.println("the entering elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
				
			}
		}
		System.out.println("largest value in an array:"+largest);
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
			
		}
		
		System.out.println("smallest value in an array:"+smallest);
		
		

	}

}