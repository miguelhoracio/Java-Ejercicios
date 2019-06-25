package com.enroutesystems.main;

import java.util.ArrayList;

import com.enroutesystems.activities.*;

public class App 
{
	 public static void main( String[] args )
    {      
		 
		 
		System.out.println("//----------------- Actividad 1------------------- //");
        System.out.println("El producto mas caro es: " + Act1.producto_mas_caro(Act1.fillProducts()));
        System.out.println("El valor total en bodega es: "+Act1.valor_total_bodega(Act1.fillProducts()));
        System.out.println("El ingreso total por ventas es : "+ Act1.ingreso_total_por_ventas(Act1.fillProducts(),Act1.fillItems()));
        System.out.println("El producto con mas ingresos es: "+ Act1.producto_con_mas_ingresos(Act1.fillProducts(),Act1.fillItems()));
        System.out.println("//----------------- Actividad 1------------------- // \n \n");
      
        System.out.println("//----------------- Actividad 2------------------- //");
        double[] list = {1.3, 1.3, 1.3};
        System.out.println("La desviacion estandar es: "+ Act2.desviacion_estandar(list));
        System.out.println("//----------------- Actividad 2------------------- // \n \n");

        System.out.println("//----------------- Actividad 3------------------- // ");
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
        System.out.println("//----------------- Actividad 3------------------- // \n \n");
        
        /*ArrayList<String> z  = new ArrayList<String>();
        z.add("conejo");z.add("ornitorrinco");z.add("pez");z.add("hipopotamo");z.add("tigre");
        System.out.println("//----------------- Actividad 4------------------- // ");
        System.out.println("La lista ordenada por largo de palabra es: "+Act4.ordenar_por_largo_palabra(z));     
        System.out.println("//----------------- Actividad 4------------------- // \n \n");*/
        
        System.out.println("//----------------- Actividad 5------------------- //");
        String word = "El elefante avanza hacia Asia"; 
        System.out.println("El diccionario con las letras es el siguiente: "+Act5.contar_letras(word));        
        System.out.println("//----------------- Actividad 5------------------- // \n \n");
        
        System.out.println("//----------------- Actividad 7------------------- //");
        String a = "rocas";
        String b = "carro";
        System.out.println("¿Son anagrama?  ");     
        Act6.son_anagrama(a, b);
        System.out.println("//----------------- Actividad 7------------------- // \n \n");
        
        System.out.println("//----------------- Actividad 8------------------- //");
        char letter = 'E';
        System.out.println("¿Es vocal?  ");     
        Act8.es_vocal(letter);
        System.out.println("//----------------- Actividad 8------------------- // \n \n");
        
       /* System.out.println("//----------------- Actividad 9------------------- //");
        String fileName = "calificaciones.txt";
        System.out.println("¿Es vocal?  ");     
        Act9.aprobado(fileName);
        System.out.println("//----------------- Actividad 9------------------- // \n \n");*/
        
        System.out.println("//----------------- Actividad 10------------------- //");
        String fileName2 = "puntajes.txt";
        System.out.println("¿Cuantos aprobaron y reprobaron?  ");     
        Act10.obtener_puntajes(fileName2);
        System.out.println("//----------------- Actividad 10------------------- // \n \n");
        
        System.out.println("//----------------- Actividad 11------------------- //");
        String fileName3 = "texto.txt";
        System.out.println("¿Cuantas letras hay en mayusculas?");     
        Act11.mayusculas(fileName3);
        System.out.println("//----------------- Actividad 11------------------- // \n \n");
        
        System.out.println("//----------------- Actividad 12------------------- //");
        System.out.println("¿Existe este producto?");     
        Act12.existe_producto(9801);
        System.out.println("//----------------- Actividad 12------------------- // \n \n");
    }
     
}
