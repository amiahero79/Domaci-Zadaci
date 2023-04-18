package bozovic.milos;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.print("Unesite vrednost true ili false za x = ");
boolean x = input.nextBoolean();
System.out.print("Unesite vrednost true ili false za y = ");
boolean y = input.nextBoolean();

boolean z = !(x & y)| x & y;

System.out.println("Logička promenljiva z ima vrednos z = " + z);
	}

}
