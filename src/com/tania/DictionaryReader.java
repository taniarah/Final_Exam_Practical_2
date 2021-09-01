package com.tania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 

 take filename as input from user
 call doesFileExist with the filename as parameter
 if(file exists based on previous call){
  // print the words in the specified format reading the file with filename collected earlier
   printFile(name)
 }
 
 
 method doesFileExist(String path){
     try to read the file with path
     if exception raised, return false
     else return true
 }

 method printFile(String path){
 
 read the file in a scanner
 loop until no more line found in scanner{
      
      read next line from the scanner
      split the line into two parts: word, meanings (delimiter should be '-')
      print the word
      now, split the meanings into multiple substrings: meaning-words (delimeter should be ',')
      loop at all meaning-words{
        print the current meaning-word
      }
 }
 
 close file/scanner
 
 }
 

*/

public class DictionaryReader {

	public static void printFile(String name) {
		 try {
		      File myObj = new File(name);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String line = myReader.nextLine();
		       String[] lineParts = line.split("-");
	
		        //System.out.println("Word: " + lineParts[0] + " Meanings: " + lineParts[1]);
		        System.out.println(lineParts[0]);
		  
		        String[] meaningParts = lineParts[1].split(",");
		        for(String meaning: meaningParts){
		        	System.out.println(meaning.trim());
		        }
		        
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		
	}
	
	
	
	}	
	
	public static void main(String[] args) {
		// take filename as input from user
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter file name");
		String name = myScanner.nextLine();	
		boolean exists = doesFileExist(name);
		if(exists == true) {
			System.out.println("File exists!");
		}else {
			System.out.println("File does not exist!");	
		} 
		printFile(name);	
		
		}
	
	
	

	public static boolean doesFileExist(String path) {   	
		File myObj = new File(path);
		return myObj.exists();
	}
	
	

}
