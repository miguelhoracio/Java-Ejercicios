package com.enroutesystems.main;
import com.enroutesystems.activities.Act1;
public class App 
{
	 public static void main( String[] args )
    {      
        System.out.println(Act1.producto_mas_caro(Act1.fillProducts()));
        System.out.println(Act1.valor_total_bodega(Act1.fillProducts()));
        System.out.println(Act1.ingreso_total_por_ventas(Act1.fillProducts(),Act1.fillItems()));
        System.out.println(Act1.producto_con_mas_ingresos(Act1.fillProducts(),Act1.fillItems()));
    }
    
}
