package com.dnapass.java.training.day5;

import java.util.Scanner;

public class ArrayAscendingOrder {

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
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		for(int array:arr)

		{
			System.out.println(array+" ");
		}
	}

}