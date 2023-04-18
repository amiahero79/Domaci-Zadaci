package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak18 {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		//Unos promenljive x
		System.out.print("Unesite vrdnost promenljive x: ");
		double x = input.nextDouble();
		
		// Izračunavanje funkcije
		
		double y = Math.sqrt((Math.exp(x/2)+1.2*Math.sin(2*x))/(3.3*Math.cos(x)+7.1*Math.exp(x)));
		
		//Štampanje rezultata
		
		System.out.print("Iznos funkcije y = " + df.format(y));
		
		
		

	}

}
