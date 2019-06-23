package com.enroutesystems.activities;

import java.util.HashMap;

public class Act5 {	
	public static HashMap<String, Integer> contar_letras(String a){
		a = a.toLowerCase();
	 HashMap<String, Integer> word = new HashMap<String, Integer>();
	 for(int i=0;i<a.length();i++) {
		 word.put(Character.toString(a.charAt(i)), 0);
	 }
	 for(int j=0;j<a.length();j++) {
		 int b = 0;
		 for(int k=0;k<a.length();k++) {
		 if (word.get(Character.toString(a.charAt(j)))==word.get(Character.toString(a.charAt(k)))){
			 b++;
			 word.put(Character.toString(a.charAt(j)), b);
		 	}
		 }
	 }
	 return word;
	}
}
