package bozovic.milos;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak5 {

		public static void main(String[] args) throws Exception {
					
		DecimalFormat df = new  DecimalFormat ();			
		Scanner sc = new Scanner(System.in);
		
		// Unos brojeva  n,  a  i e
		System.out.println("Unesite vrednost za n : ");
		 int n = sc.nextInt();
				    
	    System.out.println("Unesite vrednost za a : ");
		int	a = sc.nextInt();
				    
	    System.out.println("Unesite vrednost za e : ");
		double e = sc.nextDouble();
				   
		//Izračunavanje x0 i x1
	    double x0 = (a + n - 1) / n;
	    double x1 = ((n - 1) * x0 + a/Math.pow(x0, n-1))/n;
				    
	    // Petlja While 
		 while(Math.abs(x1-x0)>e) {
			if(a > 0)
				x0=x1;
				x1=((n-1)) * x0 + a / Math.pow(x0, n-1)/n;    
				}
		 
		 // Petlja Do-While
		 /* do {
			   if(a>0)
		    	x0=x1;
		    	x1=((n-1)) * x0 + a / Math.pow(x0, n-1)/n;
		    } while(Math.abs(x1-x0)>e);  
		  */
				 
		// Štampanje rezultata
		 
		System.out.println("Dobijena vrijednost je x = " + df.format(x1));	 
		sc.close();

		}    
		}
		
		