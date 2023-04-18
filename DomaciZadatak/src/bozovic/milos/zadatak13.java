package bozovic.milos;

import java.util.Scanner;

public class zadatak13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.print("Unesite vrednost za promenljivu a: ");
double a = input.nextDouble();
System.out.print("Unesite vrednost za promenljivu b: ");
double b = input.nextDouble();
System.out.print("Unesite vrednost za promenljivu c: ");
double c = input.nextDouble();
System.out.print("Unesite vrednost za promenljivu k: ");
double k = input.nextDouble();

System.out.println("Vrednost zadatka pod a) " + (a*b + a * c));
System.out.println("Vrednost zadatka pod b) " + (3*(2*a-8*b)/c));
System.out.println("Vrednost zadatka pod c) " + ((a+b)*(3*k+1)/(k-3)));




	}

}
