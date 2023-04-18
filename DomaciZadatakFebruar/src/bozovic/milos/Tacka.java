package bozovic.milos;

public class Tacka {
	
	double x, y;

	Tacka() {
		
	}
	Tacka(double x) {
		this.x = x;
	}
	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Dohvatanje vrednosti X 
	public double getX() {
			return x;
		}
	//Postavljanje vrednosti X 
	public void setX(double x) {
			this.x = x;
		}
		
	//Dohvatanje vrednosti Y 
	public double getY() {
		return y;
		}
	//Postavljanje vrednosti Y 
	public void setY(double y) {
			this.y = y;
		}
	//Rastojanje tačke od koordinatnog početka
	double poteg() {
		return Math.sqrt(x*x+y*y);
	}
	//Rastojanje između dve tačke
	double Rastojanje(Tacka t) {
		return Math.sqrt(Math.pow(x - t.x, 2)+Math.pow(y - t.y, 2));
	}
	//Metoda 3: Ispisivanje vrednosti koordinata
		public String toString() {
			return "X = "+getX()+", Y = "+getY();
		}
	
	
}


