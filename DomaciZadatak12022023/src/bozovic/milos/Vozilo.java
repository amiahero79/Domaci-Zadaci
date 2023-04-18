package bozovic.milos;

public abstract class Vozilo {
	
 protected double tezina = 100;
 protected double sila;
 

 
 Vozilo (double tezina) {
	 this.tezina = tezina;	 
 }
 
 public abstract double ukupnaTezina();
 public abstract double vucnaSila();
 
 

}
