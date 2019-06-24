package com.enroutesystems.activities;

public class Act8 {

	public static boolean es_vocal(char a) {
		boolean is = true;
		String vocals = "aeiouAEIOU";
		for(int i = 0;i<vocals.length();i++){		
		    if(!vocals.contains(String.valueOf(a))){
		      is = false;		      
		    }
		  }
		System.out.println(is);
		return is;
		
	}
}
