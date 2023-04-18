package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak8 {

	
	    public static void main(String[] args) throws Exception {
	    	
	    	
		/* Inicijalziacija promenljivih */
		double s1, s2, s3, s4, y, b0, b1;
		s1 = s2 = s3 = s4 = y = b0 = b1 = 0d;
		
		
		Scanner ulaz = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		/* Unos podataka */
		System.out.println("Unesite vrednost za n: ");
		int n = ulaz.nextInt();

		/* Kreiranje nizova x i f */
		double[] x = new double[n + 1];
		double[] f = new double[n + 1];

		/* Unos podataka u niz x */
		System.out.println("Unesite elemente niza x:");
		for (int i = 0; i < n; i++) {
		    System.out.print("x[" + i + "] = ");
		    x[i] = ulaz.nextDouble();

		}

		/* Unos podataka u niz f */
		System.out.println("Unesite elemente niza f:");
		for (int i = 0; i < n; i++) {
		    System.out.print("f[" + i + "] = ");
		    f[i] = ulaz.nextDouble();
		}

		/* Obrada podataka */
		for (int i = 0; i < n; i++) {
		    s1 += Math.log(x[i]);
		    s2 += Math.log(f[i]);
		    s3 += Math.log(x[i]) * Math.log(f[i]);
		    s4 += Math.pow(Math.log(x[i]), 2);
		}

		/* Izračunavanje koeficijenta b1 */
		b1 = (s1 * s2 - n * s3) / (s1 * s1 - n * s4);

		/* Izračunavanje koeficijenta b0 */
		b0 = Math.pow(10, (s2 - b1 * s4) / n);

		/* Štampanje tabele */
		System.out.println("\n X\t\t Y(X)");
		double temp = x[0];

		/* Štampanje tabele */
		while (temp <= x[n - 1]) {
		    y = b0 * Math.pow(temp, b1);
		    System.out.println(df.format(temp) + "\t\t" + df.format(y));
		    temp += 0.1;
		}

		ulaz.close();

	    }

	}