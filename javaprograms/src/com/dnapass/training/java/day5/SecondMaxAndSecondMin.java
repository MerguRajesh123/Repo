package com.dnapass.training.java.day5;

import java.util.Scanner;

public class SecondMaxAndSecondMin {

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
    System.out.println("the second largest element is:"+arr[arr.length-2]);
    for(int i=0;i<arr.length;i++)
   	{
   		for(int j=i+1;j<arr.length;j++)
   		{
   			if(arr[i]<arr[j])
   			{
   				int temp=arr[i];
   				arr[i]=arr[j];
   				arr[j]=temp;
   			}
   		}
   	}
   System.out.println("the second smallest element is:"+arr[arr.length-2]);
   
	}

}