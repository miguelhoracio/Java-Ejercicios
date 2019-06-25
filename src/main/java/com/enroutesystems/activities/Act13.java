package com.enroutesystems.activities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Act13 {
	
	public static void obtener_puntajes(String fileName, String fileName2) throws IOException {
		String directory = System.getProperty("user.home");  
		String absolutePath = directory + File.separator + fileName;
		String absolutePath1 = directory + File.separator + fileName2;
		ArrayList<Integer> ln = new ArrayList<Integer>();
		
		File fout = new File(directory + File.separator +"c.txt");
    	FileOutputStream fos = new FileOutputStream(fout);
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    	
		try(BufferedReader fileReader = new BufferedReader(new FileReader(absolutePath))) {  
		    String line = fileReader.readLine();
		    while(line != null) {
		    	ln.add(Integer.parseInt(line));
		    	line = fileReader.readLine();}
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
			}
		
		try(BufferedReader fileReader1 = new BufferedReader(new FileReader(absolutePath1))) {  
		    String line1 = fileReader1.readLine();
		    while(line1 != null) {
		    	ln.add(Integer.parseInt(line1));
		    	line1 = fileReader1.readLine();}
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
			}
		Collections.sort(ln);
		for (int i=0;i<ln.size();i++) {
		    	bw.write(Integer.toString(ln.get(i)));
				bw.newLine();
		}
		bw.close();
	
		}

}
