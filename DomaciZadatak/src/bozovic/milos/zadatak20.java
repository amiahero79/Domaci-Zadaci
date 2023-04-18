package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak20 {

	public static void main(String[] args) throws Exception {

Scanner input = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.##");

// Unos dužina stranica trougla
System.out.print("Unesite dužinu stranice trougla a: ");
double a = input.nextDouble();
System.out.print("Unesite dužinu stranice trougla b: ");
double b = input.nextDouble();
System.out.print("Unesite dužinu stranice trougla c: ");
double c = input.nextDouble();

//Izračunavanje dužine simetrale ugla iz temena A

double La = (1/(b+c))*Math.sqrt(b*c*(Math.pow((b+c),2)-Math.pow(a, 2)));

//Izračunavanje dužine simetrale a

double ma = (Math.sqrt(2*(Math.pow(b, 2)+Math.pow(c, 2))-Math.pow(a, 2)))/2;

//Štampanje rezultata

System.out.print("La = " + df.format(La) + "\nma = " + df.format(ma));
	}

}
