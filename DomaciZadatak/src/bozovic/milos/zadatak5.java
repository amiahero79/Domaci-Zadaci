package bozovic.milos;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);		
		
System.out.print("Unesite vrednost za stranicu trougla x = ");
int x = input.nextInt();
System.out.print("Unesite vrednost za stranicu trougla y = ");
int y = input.nextInt();
System.out.print("Unesite vrednost za stranicu trougla z = ");
int z = input.nextInt();

boolean p = (x + y > z) && (x + z > y)&&(y + z > x);

System.out.print("Moguće je napraviti trougao sa ovim stranicama = " + p);


	}

}
