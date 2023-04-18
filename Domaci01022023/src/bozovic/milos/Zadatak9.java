package bozovic.milos;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		
	//deklaracija promenljivih i inicijalizacija
	String str;
	int space = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite tekst: ");
	str = sc.nextLine();
	
	int i = 0;
	while(i < str.length()) {
		char ch = str.charAt(i);
		if(ch == ' ') {
			space++;
		}
		i++;
	}
	System.out.println("U okviru teksta je bilo " + space + " razmaka.");	

	}

}
