package com.dnapass.training.java.day5;

import java.util.Scanner;

public class RemoveSpecificElementInAnArray {

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
		System.out.println("enter the element you want to remove");
		int elem=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==elem)
			{
				for(int j=i;j<n-1;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		

	}

}