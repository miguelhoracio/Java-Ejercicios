package com.enroutesystems.main;

import java.util.ArrayList;
import java.util.Collections;

import com.enroutesystems.models.*;

public class App 
{
	
	public static String producto_mas_caro(ArrayList<Product> products)
	{
		int max = 0;
		for(int i=1; i<products.size();i++) {
			if (products.get(i).getPrice() > products.get(i-1).getPrice()) {
				max = i;
			}
		}
		String masCaro = products.get(max).getName();
		return masCaro;
	}
	
	public static int valor_total_bodega(ArrayList<Product> products)
	{
		int sum = 0;
		int mult = 0;
		for(int i=0; i<products.size();i++) {
			mult = products.get(i).getPrice() * products.get(i).getAmount();
			sum += mult;
		}
		return sum;
	}
	
	public static int ingreso_total_por_ventas(ArrayList<Product> products, ArrayList<Item> items)
	{
		int sum = 0;
		int mult = 0;
		for(int i=0; i<products.size();i++) {
			for(int j=0; j<items.size();j++) {
			if(products.get(i).getCode()==items.get(j).getCode() ) {
				 mult = products.get(i).getPrice() * items.get(j).getAmount();
				 sum += mult;
				}
			}
		}
		return sum;
	}
	
	public static String producto_con_mas_ingresos(ArrayList<Product> products, ArrayList<Item> items)
	{
		int mult = 0;
		int max = 0;
		int product = 0;
		ArrayList<Integer> amountMoney = new ArrayList<Integer>();
		ArrayList<String> productNames = new ArrayList<String>();
		for(int i=0; i<products.size();i++) {
			for(int j=0; j<items.size();j++) {
			if(products.get(i).getCode()==items.get(j).getCode() ) {
				 mult = products.get(i).getPrice() * items.get(j).getAmount();
				 productNames.add(products.get(i).getName());
				 amountMoney.add(mult);
				}
			}
		}
		max = Collections.max(amountMoney);
		for(int k=0; k<productNames.size();k++) {
				if (max == amountMoney.get(k)) {
					product = k;
				}						
		}
		return productNames.get(product);
		
	}
	
    public static void main( String[] args )
    {
    	
    	ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(41419,"Fideos",450,210));
        products.add(new Product(70717,"Cuaderno", 900, 119));
        products.add(new Product(78714, "Jabon",         730, 708));
        products.add(new Product(30877, "Desodorante",  2190,  79));
        products.add(new Product(47470, "Yogur",          99, 832));
        products.add(new Product(50809, "Palta",         500,  55));
        products.add(new Product(75466, "Galletas",      235,   0));
        products.add(new Product(33692, "Bebida",        700,  20));
        products.add(new Product(89148, "Arroz",         900, 121));
        products.add(new Product(66194, "Lapiz",         120, 900));
        products.add(new Product(15982, "Vuvuzela",    12990,  40));
        products.add(new Product(41235, "Chocolate",    3099,  48));
        
        
        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(new Client("11652624-7", "Perico Los Palotes"));
        clients.add(new Client("8830268-0", "Leonardo Farkas"));
        clients.add(new Client("7547896-8", "Fulanita de Tal"));
        
        ArrayList<Sell> sells = new ArrayList<Sell>();
        sells.add(new Sell(1,2010,9,12,"8830268-0"));
        sells.add(new Sell(2, 2010,  9, 19, "11652624-7"));
        sells.add(new Sell(3, 2010,  9, 30,  "7547896-8"));
        sells.add(new Sell(4, 2010, 10,  1,  "8830268-02"));
        sells.add(new Sell(5, 2010, 10, 13,  "7547896-8"));
        sells.add(new Sell(6, 2010, 11, 11, "11652624-7"));
        
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(1, 89148,  3));
        items.add(new Item(2, 50809,  4));
        items.add(new Item(2, 33692,  2));
        items.add(new Item(2, 47470,  6));
        items.add(new Item(3, 30877,  1));
        items.add(new Item(4, 89148,  1));
        items.add(new Item(4, 75466,  2));
        items.add(new Item(5, 89148,  2));
        items.add(new Item(5, 47470, 10));
        items.add(new Item(6, 41419,  2));
       
        System.out.println(producto_mas_caro(products));
        System.out.println(valor_total_bodega(products));
        System.out.println(ingreso_total_por_ventas(products,items));
        System.out.println(producto_con_mas_ingresos(products,items));
        
        
        
        
        
        
    }
    
}
