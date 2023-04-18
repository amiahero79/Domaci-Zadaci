package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak9 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");
	
	System.out.print("Unesite katetu trougla a: ");
	double a = input.nextDouble();
	System.out.print("Unesite katetu trougla b: ");
	double b = input.nextDouble();
	System.out.print("Unesite katetu trougla c: ");
	double c = input.nextDouble();
	
	double s = (a + b + c)/2;
	double p = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	double O = a + b + c;
	System.out.print("Površina trougla je P = " + df.format(p) + "\nO = " + df.format(O));
	
	
	
	
	}

}
