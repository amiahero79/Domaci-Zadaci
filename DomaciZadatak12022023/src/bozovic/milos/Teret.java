package bozovic.milos;

public abstract class Teret {
	
	protected abstract int random();
	
	protected int id = random()*100;
	protected double specTez = 1;
	protected double zapremina = 1;
	protected char oznaka;
	protected double m = 1;
	protected double g = 9.81;
	
	public abstract double  izracunajZapreminu();
	public abstract double  izracunajSpecTezinu();
	
	Teret(int id, char oznaka)  {
		this.id = id;
		this.oznaka = oznaka;
	}

	public char getOznaka() {
		return oznaka;
	}
	
	public String toString() {
		return "Oznaka vrste tereta je: " + oznaka + " sa identifikatorom: " + id;
	}

}
