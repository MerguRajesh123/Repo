package com.dnapass.java.training.day5;

import java.util.Scanner;

public class UpdateElementPosition {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int arr[]=new int[n+1];
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
		System.out.println("enter the position where you want to insert element:");
		int pos=sc.nextInt();
		System.out.println("enter the element you want to insert element:");
		int x=sc.nextInt();
		for(int i=(n-1);i>=(pos-1);i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=x;
		System.out.println("after inserting the element:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+",");
		}
		System.out.println(arr[n]);
		

	}

}