package com.dnapass.java.training.files.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestTextFile {
	public static void main(String[] args) throws FileNotFoundException {
		new LongestTextFile().findLongestWord();
	}
public String findLongestWord() throws FileNotFoundException {
	
	String longestWord="";
	String current;
	Scanner in=new Scanner(new File("C:Users\\rajesh\\OneDrive\\Documents\\java1.txt"));
	
	while
		(in.hasNext()) {
		current=in.next();
		
		if(current.length()>longestWord.length()) {
			longestWord=current;
			
		}
	}
	System.out.println("The longest word in the text file is:"+longestWord);
	return longestWord;
}

}