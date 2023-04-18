package bozovic.milos;

import java.util.Scanner;

public class Vagon extends Vozilo {

Scanner sc = new Scanner(System.in);	
	
double [] teret = new double [100]; 
double ukTeret = 0.0;	
int broj;	
	
	Vagon(double tezina, int broj) {
		super(tezina);
	    this.teret = new double[broj];
	}
  

	public double kapacitet() {
    	return teret.length;
    }
	
	
    public void ukTeret(double ukTeret) {
    	
    	for(int i = 0; i<teret.length; i++) {
    		System.out.println("Unesite tezinu tereta: ");
    		teret[i] = sc.nextDouble();
    		ukTeret +=teret[i];
    	}
    	this.ukTeret = ukTeret;	
    }
    public double ukupnaTezina() {
		return ukTeret + tezina;
	}
    public double getukTeret() {
    	return ukTeret;
    }
	public double vucnaSila() {
		return 0;
	}
	public String toString() {
		String s = "";
		for (int i = 0; i < teret.length; i++) {
			 System.out.print(teret[i] + " ");
			 s = s +'\n';
		}
		return s;
	}
	public void ispisi() {
		System.out.println("V(" + ukTeret + " | " + this.toString() + ")");
	}
	
	}


