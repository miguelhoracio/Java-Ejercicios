package com.enroutesystems.main;
import com.enroutesystems.activities.Act1;
import com.enroutesystems.activities.Act2;
public class App 
{
	 public static void main( String[] args )
    {      
		 
		 //----------------- Actividad 1------------------- //
		 
        System.out.println(Act1.producto_mas_caro(Act1.fillProducts()));
        System.out.println(Act1.valor_total_bodega(Act1.fillProducts()));
        System.out.println(Act1.ingreso_total_por_ventas(Act1.fillProducts(),Act1.fillItems()));
        System.out.println(Act1.producto_con_mas_ingresos(Act1.fillProducts(),Act1.fillItems()));
        
      //----------------- Actividad 2------------------- //
        
        double[] list = {1.3, 1.3, 1.3};
        System.out.println(Act2.desviacion_estandar(list));
        
      //----------------- Actividad 3------------------- //
    }
     
}
