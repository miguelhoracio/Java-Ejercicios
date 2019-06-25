package com.enroutesystems.activities;

import java.util.ArrayList;
import java.util.Collections;

public class Act4 {
	
	public static ArrayList<String> ordenar_por_largo_palabra(ArrayList<String> a){

		for(int i=0;i<a.size();i++) {
			for(int j=0;j<a.size()-1;j++) {
			if (a.get(j).length()>a.get(j+1).length()) {
				Collections.swap(a, j, j+1);
				}
			}
		}		
		return a;		
	}

}
