package bozovic.milos;

public class Sanduk extends Teret{
	
	double a;
	double b;
	double c;
	
	protected int random() {
		return super.id;
	}
	
	Sanduk(int id, char oznaka, double a, double b, double c){
		super(id, 'S');
		this.a = a;
		this.b = b;
		this.c = c;
	} 
	
	double getA() {
		return a;
	}
	double getB() {
		return b;
	}
	double getC() {
		return c;
	}
	int getID() {
		return super.id;
	}
	public char getOznaka() {
		return (char)super.oznaka;
	}
	
	public double izracunajZapreminu() {
		//Zapreminu smo deklarisali u apstraktnoj klasi
		zapremina = a*b*c;
		return zapremina;
	}
	//Ima apstraktnu metodu
	public double izracunajSpecTezinu() {
		//Specijalnu tezinu smo dekalrisali i inicijalizovali u apstraktnoj klasi
		specTez = m * g * zapremina;
		return specTez;	
	}
    public String toString()  {
    	return super.toString() + " i zapreminom od " + zapremina + " i specifičnom težinom od " + specTez;
    }
	
	
	
	

}
