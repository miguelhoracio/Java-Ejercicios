package com.enroutesystems.main;

import java.util.ArrayList;

import com.enroutesystems.activities.Act1;
import com.enroutesystems.activities.Act2;
import com.enroutesystems.activities.Act3;
public class App 
{
	 public static void main( String[] args )
    {      
		 
		 
		System.out.println("//----------------- Actividad 1------------------- //");
        System.out.println("El producto mas caro es: " + Act1.producto_mas_caro(Act1.fillProducts()));
        System.out.println("El valor total en bodega es: "+Act1.valor_total_bodega(Act1.fillProducts()));
        System.out.println("El ingreso total por ventas es : "+ Act1.ingreso_total_por_ventas(Act1.fillProducts(),Act1.fillItems()));
        System.out.println("El producto con mas ingresos es: "+ Act1.producto_con_mas_ingresos(Act1.fillProducts(),Act1.fillItems()));
        
      
        System.out.println("//----------------- Actividad 2------------------- //");
        double[] list = {1.3, 1.3, 1.3};
        System.out.println("La desviacion estandar es: "+ Act2.desviacion_estandar(list));
        

        System.out.println("//----------------- Actividad 3------------------- // \n");
        double x = 1.1;
        ArrayList<Integer> p  = new ArrayList<Integer>();
        ArrayList<Integer> q  = new ArrayList<Integer>();
        ArrayList<Integer> r  = new ArrayList<Integer>();
        p.add(1);p.add(2);p.add(1);
        q.add(4);q.add(-17);
        r.add(-1);r.add(0);r.add(0);r.add(-5);r.add(0); r.add(3);
        		
        System.out.println("El grado del polinomio es: "+Act3.grado(r));
        System.out.println("EL polynomio evaluado con "+x+ " da: "+Act3.evaluar(r,x));
        System.out.println("La suma de los polinomios es: "+Act3.sumar_polinomios(r,p));     
        System.out.println("La derivada del polinomio es: "+Act3.derivar_polinomio(r)); 
   
    }
     
}
