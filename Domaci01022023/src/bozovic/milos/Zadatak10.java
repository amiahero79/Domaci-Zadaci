package bozovic.milos;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	
	//Deklaracija niza i zauzimanje prostora u nizu
	int [] niz = new int [10];
	
	//Unos vrednosti u niz
	for(int i = 0; i < niz.length; i++) {
		System.out.println("Unesite broj: ");
        niz[i] = sc.nextInt();		
	}
	//Štampanje niza korišćenjem unapređene for petlje
	for(int i : niz)
		System.out.printf("%s ", i);
	
	//Unos broja za koji želimo da proverimo da li je u nizu
	System.out.println("Unesite broj koji proveravamo: ");
	int broj = sc.nextInt();
	//deklarišemo i inicijalizujemo brojač
	int b = 0;
	
	//Prolazimo kroz niz i proveravamo da li postoji broj
	for(int i = 0; i < 10; i++) {
		if(niz[i] == broj)
			b++;
	} 
	System.out.println("Broj " + broj + " se nalazi " + b + " puta u nizu.");	
		
	}

}
