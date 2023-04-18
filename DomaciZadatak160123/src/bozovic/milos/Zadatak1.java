package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

	//Deklaracija promenljivih	
	double a, b, c;
	double f, g;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");
	
	//Unos podataka
	System.out.println("Unesite vrednost za promenljive a: ");
	a = sc.nextDouble();
	System.out.println("Unesite vrednost za promenljive b: ");
	b = sc.nextDouble();
	System.out.println("Unesite vrednost za promenljive c: ");
	c = sc.nextDouble();
	
	
	//Izračunavanje funkcija
	f = (a - b)/(c + (a/(c+(b/(c-b)))));
	g = (a + b + Math.sin(a))*Math.cos(c);
	
	double z = f + g;
	double r = f - g;
	
	//Štampanje rezultata
	System.out.println("Zbir funkcija f i g iznosi: " + df.format(z) + ", a razlika: " + df.format(r));
	sc.close();	
		
	}

}
