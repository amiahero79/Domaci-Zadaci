package bozovic.milos;

import java.util.Random;

public class Zadatak2 {

	public static void main(String[] args) {

	//Kreiramo objekat klase Random
		Random ra = new Random();
		
	//Deklarišemo niz tipa int
		int [] niz = new int [5];
		
		System.out.println("Prikaz pet nasumično izabranih celobrojnih vrednosti: ");
		//Generisanje slučajno izabranih celobrojn ih vrednosti
		for(int i = 0; i < niz.length; i++) {
			//Smeštanje u niz slučajnoizabranih celobrojnih vrednosti
			niz[i] = ra.nextInt(); 
			//Štampanje slučajno izabranih celobrojnih vrednosti
		System.out.print(niz[i] + " ");
		}
	}
}	
		
		

