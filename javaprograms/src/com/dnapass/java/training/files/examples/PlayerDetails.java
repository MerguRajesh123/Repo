package com.dnapass.java.training.files.examples;


 import java.io.*;  
import java.util.Scanner; 
public class PlayerDetails  {  
public static void main(String[] args) throws Exception  {  
		//parsing a CSV file into Scanner class constructor  
		Scanner sc = new Scanner(new File("C:Users\\rajesh\\OneDrive\\Documents\\java2.txt"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		while (sc.hasNext())  //returns a boolean value  
		{  
		System.out.print(sc.next());  //find and returns the next complete token from this scanner  
		}   
		sc.close();  //closes the scanner  
		}  
		

	}