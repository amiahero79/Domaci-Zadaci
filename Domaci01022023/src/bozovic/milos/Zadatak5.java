package bozovic.milos;

import java.util.LinkedList;
import java.util.List;

public class Zadatak5 {

	public static void main(String[] args) {
  
		
	//Kreiranje dinamičkog niza - LInkedList	
	List<String> lista = new LinkedList<String>();	
	
	//Dodavanje imena u listu koristeći ugrađenu metodu add()
	lista.add("Milos");
	lista.add("David");
	lista.add("Aleksa");
	lista.add("Ćosa");
	lista.add("Uroš");
	lista.add("Jelena");
	lista.add("Ana");
	lista.add("Tanja");
	lista.add("Sanja");
	lista.add("Nikolina");
	
	System.out.println("Naš dinamički niz sadrži imena:");
	for(String s : lista)
		System.out.printf("%s ", s);
	
	//Postavljanje vrednosti u povezanoj listi
	lista.set(4, "Marko");
	System.out.println();
	System.out.println("\nNaš dinamički niz nakon izmene na petoj poziciji:");
	for(String s : lista)
		System.out.printf("%s ", s);
	
	//Obrisati ime pomoću metode remove
	lista.remove(3);
	System.out.println();
	System.out.println("\nNaš dinamički niz nakon brisanja na četvrtoj poziciji:");
	for(String s : lista)
		System.out.printf("%s ", s);
	
	}

}
