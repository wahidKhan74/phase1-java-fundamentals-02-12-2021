package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {
	
	static String path ="/home/wahidkhan74gmai/dell-workspace/documents/";
	
	public static void main(String[] args) {
		
//		createFileUsingFileClass("test.txt");
		createFileUsingFileOutputStream("users.txt");
	}

	// create file using File class
	private static void createFileUsingFileClass(String filename) {
		
		File file = new File(path+filename);
		
		//create new file
		try {
			
			if(file.createNewFile()) {
				System.out.println("File is created. !");
			} else {
				System.out.println("File already exists. !");
			}
			// Write Content
			FileWriter writer = new FileWriter(file);
			writer.write("Test Data to file");
			writer.close();
			
		} catch (IOException e) {
			System.out.println("File Creation Failed !");
		}
	}
	
	// create file using FileOutStream
	private static void createFileUsingFileOutputStream(String filename) {
		
		try {
			String data = "\nBrayn Smith";
			// create new file
			FileOutputStream out = new FileOutputStream(path+filename,true);
			// write data with output stream
			out.write(data.getBytes());
			System.out.println("File is created and data is Written. !");
			
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File Creation Failed !");
		} catch (IOException e) {
			System.out.println("File Write Operation Failed !");
		}
		
	}
}
