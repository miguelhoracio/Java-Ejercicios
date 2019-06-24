package com.enroutesystems.activities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Act10 {
	public static void obtener_puntajes(String fileName) {
	String directory = System.getProperty("user.home");  
	String absolutePath = directory + File.separator + fileName;
	int[] ln = new int[1000];
	int i = 0;
	try(BufferedReader fileReader = new BufferedReader(new FileReader(absolutePath))) {  
	    String line = fileReader.readLine();
	    while(line != null) {
	    	ln[i] = Integer.parseInt(line);
	    	line = fileReader.readLine();
	    	i++;
	    }
	} catch (FileNotFoundException e) {
	    // exception handling
	} catch (IOException e) {
	    // exception handling
		}
	int aprobados = 0;
	int reprobados = 0;
	for (int j = 0; j<ln.length;j++) {
		if (ln[j]>764) {
			aprobados +=1;
		} else {
			reprobados +=1;
		}
	}
	System.out.println("Aprobados: "+aprobados+" Reprobados: "+reprobados);
	}
}