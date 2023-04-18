package bozovic.milos;

import java.text.DecimalFormat;

public class Zadatak4 {

	public static void main(String[] args) {

		
		
		// Inicijalizacija promenljivih 
	    double x, y, a, z;
		int rb;
			
			DecimalFormat df = new DecimalFormat("#.##");
			
		// Pokretanje 3 for petlje i izračunavanje funkcije
			System.out.println("R.Br\tx\ta\ty\tz");
			System.out.println("--------------------------------------");
			rb = 0;
			for(x=1; x<=4; x += 1)
				for(a=0.1; a<=0.5; a+=0.1)
					for(y=0.5;y<=0.6; y += 0.05) {
						rb ++;
						
		// Izračunavanje funcije z
						z = (Math.pow(((x+a+y)/(x-y)), 2)) - (x/(x+a));
					
		// Štampanje rezultata			
						
						System.out.println(rb + "\t" + x + "\t"+ df.format(a) + "\t" + y + "\t" + df.format(z));
		} 
			} 
	} 
