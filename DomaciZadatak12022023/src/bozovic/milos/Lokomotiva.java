package bozovic.milos;

public class Lokomotiva extends Vozilo {
	
	protected double sila;
	
	Lokomotiva(double tezina, double sila) {
		super(tezina);
		this.sila = sila;
	}
	public double ukupnaTezina() {
		return tezina;
	}
	public double vucnaSila() {
		return sila;
	}
	public String toString() {
		return "L(" + tezina + " | " + sila + ")"; 
				
	}

}
