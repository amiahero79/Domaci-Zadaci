package bozovic.milos;

import java.util.Scanner;

public class zadatak19 {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		// Unos podataka
		System.out.print("Unesite vrednost za logičku promenljivu x: ");
		boolean x = input.nextBoolean();
		System.out.print("Unesite vrednost za logičku promenljivu y: ");
		boolean y = input.nextBoolean();

		//Izračunavanje funkcije
		
		boolean z = !(x|y)&!x|y;
		
		System.out.print("LOgička vrednost funkcije z = " + z);
		
		
	}

}
