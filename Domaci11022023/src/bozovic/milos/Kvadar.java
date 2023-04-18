package bozovic.milos;

public class Kvadar extends Predmet {
	
	double a;
	double b;
	double c;
	double m = 1;
	
	Kvadar () {
		a = 1;
		b = 1;
		c = 1;	
	}
	Kvadar(double aa, double bb, double cc) {
		a = aa;
		b = bb;
		c = cc;
	}
	public void setOznaka(char o) {
		//dodeljujemo atribut apstraktne klase
		super.oznaka = o;	
	}
	public char getOznaka() {
		return oznaka;
	}
	//Ima apstraktnu metodu
	public double izracunajZapreminu() {
		//Zapreminu smo deklarisali u apstraktnoj klasi
		zapremina = a*b*c;
		return zapremina;
	}
	//Ima apstraktnu metodu
	public double izracunajSpecTezinu() {
		//Specijalnu tezinu smo dekalrisali u apstraktnoj klasi
		specTezina = m * 9.807 *a*b*c;
		return specTezina;
		
	}
	public void ispisi() 	{
		System.out.println("Predmet oznake: " + getOznaka()  + " ima zapreminu: " + izracunajZapreminu() + " i specifičnu težinu: " + izracunajSpecTezinu());
	}
	
	

}
