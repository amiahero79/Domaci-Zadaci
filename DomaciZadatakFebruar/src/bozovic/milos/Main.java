package bozovic.milos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite koordinatu tačke 2: ");
		double x1 = sc.nextDouble();
		System.out.println("Unesite koordinatu x i y tačke 3 ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		

		Tacka t1 = new Tacka(); // 0,0
		Tacka t2 = new Tacka(x1); // 5,0
		Tacka t3 = new Tacka(x2,y2); // 2,2
		
		System.out.println("Koordinate tačke 1: " + t1.toString());
		System.out.println("Koordinate tačke 2: " + t2.toString());
		System.out.println("Koordinate tačke 3: " + t3.toString());
		
		System.out.println("Rastojanje od koordinatnog početka je: " + t1.poteg());
		System.out.println("Rastojanje od koordinatnog početka je: " + t2.poteg());
		System.out.println("Rastojanje od koordinatnog početka je: " + t3.poteg());

		System.out.println();
		
		System.out.println("Rastojanje tačke od tačke: " + t1.Rastojanje(t2));
		System.out.println("Rastojanje tačke od tačke: " + t2.Rastojanje(t3));
		System.out.println("Rastojanje tačke od tačke: " + t3.Rastojanje(t1));	
			
		sc.close();	
	}	
}
