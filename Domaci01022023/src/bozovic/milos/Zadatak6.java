package bozovic.milos;

public class Zadatak6 {

	public static void main(String[] args) {

		//Koristimo metodu Integer.toBinaryString()
		
		System.out.println("\tdekad\tbinar");
		for(int i = 0; i < 10; i++)
		System.out.println("\t" + i + "\t" + Integer.toBinaryString(i));	
		
		
	}

}
