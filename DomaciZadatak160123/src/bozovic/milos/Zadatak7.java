package bozovic.milos;

import java.util.Scanner;

public class Zadatak7 {

	 public static void main(String[] args)throws Exception {

			Scanner sc = new Scanner(System.in);

				
				 
		    //Unos broja n
			System.out.println("Unesite broj elemenata n : ");
			int n = sc.nextInt();
			
			int [] a = new int [100];
			int [] b = new int [100];
						
			for(int i = 1; i<=n ; i++) {
			System.out.println("a[ " +i+"] = ");
			a[i] = sc.nextInt(); 
			}
						
			for(int i = 1; i<=n ; i++) {
			System.out.println("a[ " +i+"] = ");
			a[2*n+1-a[i]] = sc.nextInt();   
			}
		    System.out.print("[b] = ");
		    
			for (int i=1;i<=n; i++) {
			b[i] = (a[i] + a[2*n+1-a[i]])/2;
		    
			// Štampanje rezultata
			System.out.print(b[i] + "  ");    }

			}    }