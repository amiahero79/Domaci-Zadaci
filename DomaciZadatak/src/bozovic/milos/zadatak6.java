package bozovic.milos;

import java.util.Scanner;

public class zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.print("Unesite pravougaonika a i b: ");
int a = input.nextInt();
int b = input.nextInt();

System.out.print("Unesite stranice pravougaonika c i d: ");
int c = input.nextInt();
int d = input.nextInt();

boolean p = ((a < c)&&(b < d) ||(a < d)&&(b<c));

System.out.print("p =" + p);



	}

}
