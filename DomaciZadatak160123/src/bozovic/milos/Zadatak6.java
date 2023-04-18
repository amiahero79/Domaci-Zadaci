package bozovic.milos;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
		
	
	System.out.println("Unesite vrednost za n: ");
	int n = sc.nextInt();
	
	double p = 1;
	for(int i = 1; i <= n; i++) {
		
		p= p*(1- (1/(1+(double)i)));
		
	}
	System.out.println("P = " + p);
	}

}
