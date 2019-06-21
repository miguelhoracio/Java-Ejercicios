package com.enroutesystems.activities;

import java.util.ArrayList;

public class Act3 {
	
	public static ArrayList<Integer> createPoly(){
	ArrayList<Integer> p = new ArrayList<Integer>();
    p.add(-1);
    p.add(0);
    p.add(0);
    p.add(-5);
    p.add(0);
    p.add(3);
	return p;   
	}
	public static int grado(ArrayList<Integer> p) {
		return p.size()-1;	
	}
	
	public static double evaluar(ArrayList<Integer> p, double x) {
		double sum = p.get(0);
		for (int i=1;i<p.size();i++) {
			sum+=p.get(i)*Math.pow(x,i);
		}
		
		return sum;		
	}
	
	public static ArrayList<Integer> sumar_polinomios(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> c = new ArrayList<Integer>();
		if(a.size()>b.size()) {
		for (int i=0;i<a.size();i++) {
			if(b.size()>i) {c.add(a.get(i)+b.get(i));}
				else {c.add(a.get(i));}
				}
			}else {System.out.println("El primer argumento debe ser mayor al segundo");}
		
		return c;
	}
	
	public static ArrayList<Integer> derivar_polinomio(ArrayList<Integer> p){
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int i=1;i<p.size();i++) {
			c.add(p.get(i)*i);
		}
		return c;
	}
	
}
