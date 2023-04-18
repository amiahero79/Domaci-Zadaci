package bozovic.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.##");
System.out.print("Unesite vrednost temperature po Celzijusovoj skali tc = ");
double tc = input.nextDouble();
double fr = tc*1.8 + 32;

System.out.print("Iznos temperature pretvorene iz celzijusa u farenhajt je fr = " + df.format(fr));



	}

}
