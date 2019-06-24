package com.enroutesystems.activities;

public class Act6 {
	
	public static void son_anagrama(String palabraUno, String palabraDos) {
		boolean is = true;
		if(palabraUno.length()==palabraDos.length()){
		  for(int i = 0;i<palabraUno.length();i++){		
		    if(!palabraDos.contains(String.valueOf(palabraUno.charAt(i)))){
		      is = false;		      
		    }
		  }
		}
		else{
		  is = false;
		}
		System.out.println(is);
	}

}
