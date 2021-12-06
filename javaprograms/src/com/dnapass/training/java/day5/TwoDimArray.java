package com.dnapass.training.java.day5;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		int row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of row");
		row=sc.nextInt();
		System.out.println("enter the total number of column");
		col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("enter elements for row="+(i+1)+"col="+(j+1)+":");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("you have enter the following arry");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	

	}

}