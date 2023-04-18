package bozovic.milos;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);

System.out.println("Unesite vrendons za a  ");
double a = input.nextDouble();

System.out.println("Unesite vrednost za b = ");
double b = input.nextDouble();

double y = Math.max(a*a*a, b*b*b);

System.out.print("y = " + y);
	}

}
