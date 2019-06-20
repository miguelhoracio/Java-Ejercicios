package com.enroutesystems.activities;

public class Act2 {
	
	public static double desviacion_estandar(double[] a) {
		double sum = 0.0;
		double sum2 = 0.0;
		double rest = 0.0;
		double ans = 0.0; 
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		double prom = sum/a.length;
		
		for(int j=0;j<a.length;j++) {
			rest = a[j]-prom;
			rest = Math.pow(rest, 2) ;
			sum2 += rest;
		}
		ans = sum2/a.length;
		return Math.sqrt(ans);		
	}

}
