package com.dnapass.java.training.day5;

import java.util.Scanner;

public class TwoDimenArrayForEach {

	public static void main(String[] args) {
	    int row,col;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter total number of rows");
	    row=sc.nextInt();
	    System.out.println("enter total number of columns");
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
	    System.out.println("you have enter the following element");
	    for(int[] array:arr)
	    {
	    	System.out.println(array);
	    }
       
	}

}
