package bozovic.milos;

import java.util.Scanner;

public class Zadatak8 {
	
	public static int sumaCifara(int broj) {
	if(broj == 0)
		return 0;
	return (broj % 10 + sumaCifara(broj/10));
	}
	

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj: ");
	int broj = sc.nextInt();
	
	int suma = sumaCifara(broj);
    System.out.println("Suma cifara broja: " + broj + " iznosi: " + suma);
		
		
		
		
	}

}
