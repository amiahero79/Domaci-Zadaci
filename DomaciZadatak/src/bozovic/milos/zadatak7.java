package bozovic.milos;

import java.io.*;
import java.text.DecimalFormat;

public class zadatak7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
// f - intezitet sile
// alfa-ugao izmedju sil F i koordinatne ose
// x,y - Dekartove koordinate
		
		double f, alfa, x, y;
		DecimalFormat df = new DecimalFormat("#.#");
// Unos podataka
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za intezitet sile F(kN) : ");
		f = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za ugao alfa u stepenima: ");
		alfa = Math.toRadians(Double.parseDouble(ulaz.readLine()));
// Izračunati vrednost Dekartovih koordinata
		x = f * Math.cos(alfa);
		y = f * Math.sin(alfa);
// Štampanje rezultata
		System.out.println("Vrednost Dekartovih koordinata su X = " + df.format(x) + "\tY = " + df.format(y));
		
		
	}

}
