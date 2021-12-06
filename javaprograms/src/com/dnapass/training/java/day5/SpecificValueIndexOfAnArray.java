package com.dnapass.training.java.day5;
import java.util.Scanner;

public class SpecificValueIndexOfAnArray {

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
		int specificElement=arr[2];
		System.out.println("the specific element is:"+specificElement);
		int index=0;
		for(int i=0;i<n;i++)
		{
			
			if(specificElement==arr[i])
			{
				break;
			}
			index++;
		}
			System.out.println("the specific element index is:"+index);	

	}

}