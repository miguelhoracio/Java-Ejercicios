package com.enroutesystems.activities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Act12 {
	public static void existe_producto(int code) {
			String fileName =  "productos.txt";
			String directory = System.getProperty("user.home");  
			String absolutePath = directory + File.separator + fileName;
			String[] ln = new String[5];
			boolean is = false;
			int i = 0;
			try(BufferedReader fileReader = new BufferedReader(new FileReader(absolutePath))) {  
				String line = fileReader.readLine();
			    while(line != null) {
			    	ln[i] = line;
			    	line = fileReader.readLine();
			    	i++;
			    }
			} catch (FileNotFoundException e) {
			    // exception handling
			} catch (IOException e) {
			    // exception handling
			}
			
			String[] arr0 = ln[0].split("/");
			String[] arr1 = ln[1].split("/");
			String[] arr2 = ln[2].split("/");
			String[] arr3 = ln[3].split("/");
			String[] arr4 = ln[4].split("/");

			
			if(code == Integer.parseInt(arr0[0]) || code == Integer.parseInt(arr1[0]) 
			 ||code == Integer.parseInt(arr2[0]) || code == Integer.parseInt(arr3[0])
			 ||code == Integer.parseInt(arr4[0])) {
					is = true;
				}
			System.out.println(is);
				
	}
}
