package bozovic.milos;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);	
	
	//Unos trocifrenog broja
	System.out.println("Unesite trocifreni broj a: ");
	int a = sc.nextInt();
	
	//Deklaracija promenljivih
	int s, d, j;
	
	//Izdvajanje cifara trocifrenog broja
	s = a/100;
	d = (a/10)%10;
	j = a % 10;
		
	System.out.println("stotica: " + s + " desetica: " + d + " jedinica: " + j);
	
	//Izračunavanje zahtevanog iz zadatka
	double p = s * d * j;
	double k = Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3);
	int obrnuto = j*100 + d*10 + s;
	
	//Ispis rezultata
	System.out.println("Za dati broj: " + a + "\n proizvod cifara iznosi: " + p + "\n suma kubova iznosi: " + k + "\n ispis u obrnutom redosledu je: " + obrnuto );
	sc.close();	
	}

}
