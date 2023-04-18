package bozovic.milos;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Unesite vrednost za realan broj x: ");
	int x = sc.nextInt();
	
	double y = 1;
	
	if(x < 5) {
		y = Math.pow((x-3), 2);
	} else if((x >= 5) && (x < 8)) {
		y = x + 2;
	} else if(x >= 8) {
		y = x - 1;
	}
	
	System.out.print("Za unetu vrednost x: " + x + ", vrednost funkcije y = " + y);
	sc.close();
	}
           
}
