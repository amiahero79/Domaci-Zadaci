package bozovic.milos;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
		
	//Deklaracija niza 	
	int [] m = new int [100];
	int [] par = new int [100];
	int [] nep = new int [100];	
	
	
	int brPar = 0;
	int brNep = 0;
	int broj;
	
	System.out.println("Koliko članova niza želite: ");
	broj = sc.nextInt();
	
	for(int i = 0; i < broj; i++) {
		System.out.println("Unesite broj: ");
		m[i] = sc.nextInt();
	}
	for(int i = 0; i < broj; i++) {
		if(m[i] % 2 == 0) {
			brPar++;
			par[brPar] = m[i];
		} else {
			brNep++;
			nep[brNep] = m[i];
		}
	}

	System.out.println("Ukupan broj parnih brojeva u nizu je: " + brPar + ", a neparnih: " + brNep);
	
	System.out.println("\nŠtampanje niza brojeva: ");
	for(int i = 0; i < broj; i++) {
		System.out.print(m[i] + " ");
		
	}
	System.out.println("\nŠtampanje parnih članova niza: ");
	for(int k = 1; k <= brPar; k++) {
		System.out.print(par[k] + " ");
	} 
	System.out.println("\nŠtampanje neparnih članova niza: ");
	for(int l = 1; l <= brNep; l++) {
		System.out.print(nep[l] + " ");
	} 
	}
	
}
		
	


