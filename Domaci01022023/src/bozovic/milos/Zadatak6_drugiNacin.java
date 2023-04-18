package bozovic.milos;

import java.util.*;

public class Zadatak6_drugiNacin {
	
	static void uBinarni(int n) {
		
	//Deklaracija niza za unos binarnih cifara
		int [] binar = new int [1000];
		
	//deklaracija i inicajlizacija brojača za binarni niz
		int i = 0;
		while(n > 0) {
			//unos 0 i 1 u binarni niz
			binar[i] = n % 2;
			n = n / 2;
			i++;
		}
	//Štampanje niza u obrnutom redosledu
		for(int j = i-1; j >= 0; j--)
			System.out.print(binar[j] + " ");
				
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();
		
		System.out.println("Dekadni broj: " + n);
	    System.out.print("Binarni prikaz:" ); 
		 uBinarni(n);
		
		
		
		
		
	}

}
