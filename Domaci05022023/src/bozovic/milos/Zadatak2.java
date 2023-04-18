package bozovic.milos;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
		
	System.out.println("Unesite broj članova niza: ");
	int n = sc.nextInt();

	//deklaracija niza
	int [] niz1 = new int [n+1];	

	int j = 0;
	
	//Unos elemenatan niza
	for(int i = 0; i < n; i++) {
		System.out.println("Unesite element niza: ");
		niz1[i] = sc.nextInt();
	}
	//Štampanje niza
	System.out.println("Naš niz: ");
	for(int i = 0; i < n; i++)
		System.out.print(niz1[i] + " ");
	
	
	//sortiranje niza u rastući
	int pom;
	for(int i = 0; i < n; i++) {
		for(int k = i+1; k < n+1; k++) {
			if(niz1[i] >= niz1[k]) {
				pom = niz1[i];
				niz1[i] = niz1[k];
				niz1[k] = pom;
			}	
		}	
	}
	System.out.println("\nNiz pretvoren u rastući: ");
	//Štampanje rastućeg niza
	for(int i = 1; i <= n; i++)
		System.out.print(niz1[i] + " ");
		

	//Provera da li ima duplikata i izuzimanje istih
	for(int i = 0; i <niz1.length - 1; i++) {
		if(niz1[i] != niz1[i+1]) 
			niz1[j++] = niz1[i];
	}
	//poslednji element niza
	niz1[j++] = niz1[niz1.length - 1];
	//Štampanje niza bez duplikata
	System.out.println("\nNiz bez duplih elemenata: ");
	for(int i = 1; i < j; i++ )
		System.out.print(niz1[i] + " ");

}
}
