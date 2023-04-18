package bozovic.milos;


	import java.text.DecimalFormat;

	public class Zadatak10 {

	    // Metoda za f(x,y) 
	    private static double metodaF(double x, double y) {
		return x < y ? Math.exp(x) * Math.cos(3 * y) : (x == y ? Math.sin(x) : 1 + Math.sqrt(Math.abs(x * y)));
	    }

	    // Pokretanje programa 
	    public static void main(String[] args) {
	    	
	    	
		// Kreiranje objekta df za formatiranje decimala 
		DecimalFormat df = new DecimalFormat("#.###");

		// Deklarisanje promenljivih
		double x, y, f;

		//  Izgled i štampanje tabele  
		System.out.println(" X\t Y\tF(X,Y)");
		for (x = 0.1; x <= 0.5; x += 0.1)
		    for (y = 0.01; y <= 0.03; y += 0.01) {
			f = metodaF(x, y); 
			System.out.println(df.format(x) + "\t" + df.format(y) + "\t" + df.format(f));

		    }

	}

}
