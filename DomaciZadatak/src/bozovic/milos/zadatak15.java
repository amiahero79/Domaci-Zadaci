package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak15 {

	public static void main(String[] args) throws Exception {
	
Scanner input = new Scanner(System.in);
// Decimalni format
DecimalFormat df = new DecimalFormat("#.###");
// Unos podataka
System.out.print("Unesite vrednost promenljive x: ");
double x = input.nextDouble();
System.out.print("Unesite vrednost promenljive y: ");
double y = input.nextDouble();
System.out.print("Unesite vrednost promenljive z: ");
double z = input.nextDouble();

double f = (x+y)*(x+z)*Math.sin(x)/(2*x-y);
System.out.print("Iznos funkcije f = " + df.format(f));

	}

}
