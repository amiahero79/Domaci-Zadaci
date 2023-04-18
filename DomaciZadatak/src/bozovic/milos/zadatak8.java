package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.##");
System.out.print("Unesite vrednost katete pravougaonika a: ");
int a = input.nextInt();
System.out.print("Unesite vrednost katete pravougaonika b: ");
int b = input.nextInt();
double c = Math.sqrt(a*a + b*b);
System.out.print("Vrednost dijagonale c = " + df.format(c));


	}

}
