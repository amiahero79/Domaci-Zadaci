package bozovic.milos;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	
	//Unos binarnog broja kroz konzolu
	System.out.println("Unesite binarni broj: ");
	int binar = sc.nextInt();
	
	
	
	System.out.println("Za binarni broj: " + binar);
	//ako imamo n-tocifreni binarni broj, formula za pretvaranje u dekadni je:
    //suma svih cifara pomnoženih sa 2 na od nula za poslednju cifru do n-1 za prvu cifru
	int i = 0;
	int bCifra;
	int dekad = 0;
	while(binar > 0) {
		bCifra = binar % 10;
		dekad += bCifra*Math.pow(2, i);
		binar /= 10;
		i++;	
	}
	//Štampanje rezultata
	System.out.println("dekadni je: " + dekad);		
	}
}
