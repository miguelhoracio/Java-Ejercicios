package com.enroutesystems.activities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Act9 {
		
	public static void aprobado(String fileName) {
		String directory = System.getProperty("user.home");  
		String absolutePath = directory + File.separator + fileName;
		String fileContent;
		double promedio = 0.0;
		int i = 0;
		double[] newln = new double[20];
		String[] ln = new String[20];
		String[] tempArray;
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
		tempArray[0] = Arrays.toString(ln[0].split(":"));
		tempArray[1] = Arrays.toString(ln[1].split(":"));
		tempArray[2] = Arrays.toString(ln[2].split(":"));
		tempArray[3] = Arrays.toString(ln[3].split(":"));
		for (int a = 0; a<4 ;a++) {
			for (int b = 1; b<ln[a].length() ;b++) {
				ln[0][] = Arrays.toString(ln[0].split(":"));
				//promedio += Double.parseDouble(ln[a][b]);
				
			}
		}
		/*try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {  
			
		    fileContent = 
			    bufferedWriter.write(fileContent);
		} catch (IOException e) {
		    // exception handling
		}*/

		
	}
}
