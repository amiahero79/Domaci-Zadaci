package bozovic.milos;

import java.text.DecimalFormat;

public class TestPredmet {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
	Kvadar [] k = new Kvadar [4];

	 k[0] = new Kvadar(1.0, 2.0, 3.0);
	 k[1] = new Kvadar(2,3,4);
	 k[2] = new Kvadar(2, 4, 5);
	 k[3] = new Kvadar(2, 2, 7);
	 
	 
	
	double zbir = 0;
	for(int i = 0; i <k.length; i++) {
	 zbir += k[i].izracunajSpecTezinu();
	}	
	double prosek = zbir/4;
	
	
	for(int i = 0; i <k.length; i++) {
		k[i].setOznaka('K');
		System.out.println("k[" + i + "]: ");
	    k[i].ispisi();
	if(k[i].specTezina > prosek) {
		System.out.println("Specificna tezina predmeta" + k[i].getOznaka() + i + " je veća od prosečne " + prosek);
	}
	}	
	System.out.println("----------------------------------------------------------------------");
	Sfera [] s = new Sfera [4];

	 s[0] = new Sfera(2.5);
	 s[1] = new Sfera(3);
	 s[2] = new Sfera(1.7);
	 s[3] = new Sfera(7.6);
	 
	 
	
	double zbir1 = 0;
	for(int i = 0; i <s.length; i++) {
	 zbir1 += s[i].izracunajSpecTezinu();
	}	
	double prosek1 = zbir1/4;
	
	
	for(int i = 0; i <s.length; i++) {
		s[i].setOznaka('S');
		System.out.println("s[" + i + "]: ");
	    s[i].ispisi();
	if(s[i].specTezina > prosek) {
		System.out.println("Specificna tezina predmeta" + s[i].getOznaka() + i + " je veća od prosečne " + df.format(prosek1));
	}
	}
	}
}
