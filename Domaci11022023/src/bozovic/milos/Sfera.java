package bozovic.milos;

public class Sfera extends Predmet{
	
	double poluprecnik;
	//Deklaracija i inicijalizacija mase
	double m = 1;
	
	Sfera () {
		poluprecnik = 1;
		m = 1;
	}
	
	Sfera(double r) {
		poluprecnik = r;
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
		zapremina = 3.14*poluprecnik*poluprecnik*poluprecnik*4/3;
		return zapremina;
	}
	//Ima apstraktnu metodu
	public double izracunajSpecTezinu() {
		//Specijalnu tezinu smo dekalrisali u apstraktnoj klasi
		specTezina = m * 9.807 * 3.14*poluprecnik*poluprecnik*poluprecnik*4/3;
		return specTezina;
		
	}
	public void ispisi() 	{
		System.out.println("Predmet oznake: " + getOznaka()  + " ima zapreminu: " + izracunajZapreminu() + " i specifičnu težinu: " + izracunajSpecTezinu());
	}
	
	
	
	
}


