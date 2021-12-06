package com.dnapass.java.training.example2;

import java.io.BufferedReader;
import java.io.InputStreamReader; 
public class BufferedReaderExample{    
public static void main(String args[])throws Exception{             
	    InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);            
	    System.out.println("Enter your name");    
	    String name=br.readLine();    
	    System.out.println(name);    
	}    
}