package com.dnapass.java.training.files.examples;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
 
public class FirstThreeLines {
 
   public static void main(String[] args) throws IOException {
 
      int max = 3;
 
      try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("C:Users\\rajesh\\OneDrive\\Documents\\java1.txt"))) {
         String line = lineNumberReader.readLine();
         for(int i = 1; i <= max; i++){
            int number = lineNumberReader.getLineNumber();
            System.out.println(number + " : " + line);
            line = lineNumberReader.readLine();
            if(line == null){
               System.out.println("end of file reached");
               break;
            }
         }
      }
   }
}