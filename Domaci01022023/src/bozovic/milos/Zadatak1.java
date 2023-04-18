package bozovic.milos;

import java.util.Random;

public class Zadatak1 {

	public static void main(String[] args) {
		
		// kreiramo objekat Random klase  
				Random random = new Random();   
				
				
		//Generišemo slučajno izabran ceo broj od 0 do 50 
		int x = random.nextInt(50);   
		
		// Generišemo slučajno izabran ceo broj 
		int y = random.nextInt();   
		
		// Štampanje celobrojnih slučajno izabranih brojeva 
		System.out.println("Slučajno izabrane celobrojne vrednosti: ");  
		System.out.println(x);   
		System.out.println(y);  
		
		// Generišemo slučajno izabrane realne vrednosti 
		double a = random.nextDouble();   
		double b = random.nextDouble();   
		
		// Štampamo slučajnoizabrabe realne vrednosti 
		System.out.println("\nSlučajno izabrane relane vrednosti: ");  
		System.out.println(a);   
		System.out.println(b);    
		
		// Generišemo slučajno izabrane float vrednosti 
		float f = random.nextFloat();  
		float i = random.nextFloat();  
		
		// Štampamo slučajno izabrane float vrednosti 
		System.out.println("\nSlučajno izabrane float vrednosti: ");  
		System.out.println(f);   
		System.out.println(i);   
		
		// Generišemo slučajno izabrane long vrednosti 
		
		long p = random.nextLong();   
		long q = random.nextLong();   
		
		// Štampamo slučajno izabrane long vrednosti 
		System.out.println("\nSlučajno izabrane long vrednosti: ");  
		System.out.println(p);   
		System.out.println(q);    
		
		// Generišemo slučajno izabrane logičke vrednosti  
		boolean m=random.nextBoolean();  
		boolean n=random.nextBoolean();  
		
		// Štampamo slučajno izabrane logičke vrednosti
		System.out.println("\nSlučajno izabrane logičke vrednosti: ");  
		System.out.println(m);   
		System.out.println(n);  
		
		// Deklaracija i inicijalizacija niza bajtova 
		byte[] o = new byte[7];
		byte[] r = new byte[7];
		
		// Generišemo slučajno izabrane byte vrednosti 
		random.nextBytes(o);
	    random.nextBytes(r);
	    
	    // Štampamo slučajno izabrane logičke vrednosti
	    System.out.println("\nSlučajno izabrane bajt vrednosti: "); 
	    System.out.println(o);
	    System.out.println(r);
	      
				
		
	
		
		
		
		}   
			
		

	}


