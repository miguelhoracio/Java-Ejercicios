package com.enroutesystems.activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Act11 {
	public static void mayusculas(String fileName) {
		String directory = System.getProperty("user.home");  
		String absolutePath = directory + File.separator + fileName;

		int mayusculas = 0, minusculas = 0, especiales = 0, vocales = 0;
		
		try( FileInputStream fileReader = new FileInputStream(absolutePath)){  
				char current;
		      while (fileReader.available() > 0) {
		        current = (char) fileReader.read();
		        if (current > 64 && current < 91) {
		        	mayusculas += 1;
		      }else if (current > 96 && current < 123) {
		    	  minusculas += 1;
		      }else {
		    	  especiales += 1;
		      }
		        String vocals = "aeiouAEIOU";
				for(int a = 0;a<vocals.length();a++){		
				    if(vocals.contains(String.valueOf(current))){
				      vocales += 1;		      
				    }
				  }
		    }
		} catch (IOException e) {
		      e.printStackTrace();}
		System.out.println("Mayusculas: " + mayusculas);
		System.out.println("Minusculas: " + minusculas);
		System.out.println("Especiales: " + especiales);
		System.out.println("Vocales: " + vocales/10);
		System.out.println("Porcentaje de minusculas: " + (100*minusculas)/(mayusculas + minusculas)+"%");
		
	}

}
