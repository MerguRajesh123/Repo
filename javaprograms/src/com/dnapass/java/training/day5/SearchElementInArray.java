package com.dnapass.java.training.day5;


import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the elements");
			arr[i]=sc.nextInt();
		}
		System.out.println("you want to enter the following element");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("enter the element to be searched");
		int search=sc.nextInt();
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Element "+search+" found at"+i+"position" );
				index=1;
				break;
			}
		}
		if(index==0)
		{
			System.out.println("Element "+search+"not found");
		}

	}

}