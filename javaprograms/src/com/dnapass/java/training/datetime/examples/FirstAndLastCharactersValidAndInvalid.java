package com.dnapass.java.training.datetime.examples;

import java.util.Scanner;

public class FirstAndLastCharactersValidAndInvalid {
   public static void main(String[] arg) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Type a string: ");
            String word = keyboard.nextLine(); 
            System.out.printf ("%s begins and ends with the same letter.", checkString(word));
        }
        public static boolean checkString (String word) {   
            int stringLength = word.length();
            String letter1 = (word.substring (0,1)).toUpperCase();
            String lastletter = (word.substring ((stringLength-1),(stringLength))).toUpperCase();

            if (letter1.equals(lastletter)){
                return true;
            } else {
                return false;
            }
        }
    }