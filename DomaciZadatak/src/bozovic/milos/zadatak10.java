package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak10 {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.####");

System.out.print("Unesite vrednost poluprečnika r = ");
double r = input.nextDouble();
double P = 4*r*r*Math.PI;
double V = 4*Math.pow(r, 3)*Math.PI/3;

System.out.print("\nV = " + df.format(V) + "\nP = " + df.format(P));




	}

}
