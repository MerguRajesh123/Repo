package com.dnapass.java.training.day1;

import java.util.Scanner;

public class LongestWordOfSentence {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the sentence");
    	String s1=sc.nextLine();
    	String s2[]=s1.split(" ");
    	String s3=s2[0];
    	int largest=s3.length();
    	int index=0;
    	for(int i=1;i<s2.length;i++) {
    		String s4=s2[i];
    		if(largest<s4.length()) {
    			largest=s4.length();
    			index=i;
    		}
    	}
    	System.out.println(s2[index]);
    }
}
