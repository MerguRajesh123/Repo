package com.dnapass.java.training.day5;

import java.util.Scanner;

public class SpecificValueInAnArray {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements you want to store");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements");
			arr[i]=sc.nextInt();
		}
		int specificElement=arr[0];
		for(int i=0;i<n;i++)
		{
			if(specificElement==arr[i])
			{
				System.out.println("specific value present in array:"+arr[i]);
				break;
			}
			else
				System.out.println("specific value not present:"+arr[i]);
			
		}
		

	}

}
