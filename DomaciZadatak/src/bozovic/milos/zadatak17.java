package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak17 {

	public static void main(String[] args) throws Exception {

Scanner input = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#,##");

//Unos podataka
System.out.print("Unesite stranicu trougla a: ");
double a = input.nextDouble();
System.out.print("Unesite stranicu trougla b: ");
double b = input.nextDouble();
System.out.print("Unesite stranicu trougla c: ");
double c = input.nextDouble();

//Izračunavanje poluprečnika upisanog i opisanog kruga
double s = (a + b + c)/2;
double P = Math.sqrt(s*(s-a)*(s-b)*(s-c));
double R = a * b * c /(4 * P);
double r = (a * b * c) /(2 * R * s);
double d = Math.sqrt(R*(R-2*r));

// Štampanje rezultata

System.out.println("Poluprečnik opisanog kruga R = " + df.format(R)); 
System.out.println("poluprečnik upisanog kruga r = " + df.format(r)); 
System.out.println("rastojanje između centra opisanog i upisanog kruga d = " + df.format(d));





	}

}
