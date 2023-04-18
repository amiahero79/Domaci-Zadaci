package bozovic.milos;

public class Zadatak3 {

	public static void main(String[] args) {
		
		
		System.out.println("Prosti brojevi od 1 do 10 su: ");
		for(int i = 0; i <= 10; i++) {
			int brojac = 0;
			int j = 1;
			while(j <= i) {
				if(i % j == 0)  {
					brojac ++;
				}
				j++;
				}
			
			//Prost broj je deljiv sobom i jedinicom, brojac = 2 je potvrda da je u pitanju prost broj
			if(brojac == 2)
				System.out.print(i + " ");
		
		}
	}

}	
		


