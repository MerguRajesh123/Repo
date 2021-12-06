package com.dnapass.java.training.example2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWritePlainText {
	
  public static void main(String a[]){
	  
      String strLine = "";
      try
        {
           String filename= "C:Users\\rajesh\\OneDrive\\Documents\\java.txt";
           FileWriter fw = new FileWriter(filename,false); 
           
           //appends the string to the file
           fw.write("java Exercises\n");
           fw.close();
           BufferedReader br = new BufferedReader(new FileReader(filename));
           //read the file content
           while (strLine!= null)
           {
              strLine = br.readLine();
              System.out.println(strLine);
          }
           br.close();                          
         }
         catch(IOException exc)
         {
          System.err.println("IOException: " + exc.getMessage());
         }
      }
}