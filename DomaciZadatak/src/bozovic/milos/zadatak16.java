package bozovic.milos;

import java.util.Scanner;

public class zadatak16 {

	public static void main(String[] args) throws Exception {
		
Scanner input = new Scanner(System.in);		

// Unos podataka
System.out.print("Unesite vrednost za promenljivu x: ");
double x = input.nextDouble();

boolean y = Math.sqrt((2+x-Math.pow(x, 3))/(x+2)) > 0 | Math.exp(x) < (x-1) & Math.sqrt(x-1)<= 0;

System.out.print("Logička promenljiva y ima vrednost y = " + y);


		
	}

}
