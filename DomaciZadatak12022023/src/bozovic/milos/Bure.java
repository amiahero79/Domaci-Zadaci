package bozovic.milos;

public class Bure extends Teret {
	
	double h;
	double r;
	
	protected int random() {
		return super.id;
	}
	
	Bure(int id, char oznaka, double h, double r) {
		super(id, 'B');
		this.h = h;
		this.r = r;
	}
	public double izracunajZapreminu() {
		zapremina = r *r * h * 3.14;
		return zapremina;
	}
	
	public double izracunajSpecTezinu() {
		specTez = m * g * zapremina;
		return specTez;
	}
	public String toString()  {
    	return super.toString() + " i zapreminom od " + zapremina + " i specifičnom težinom od " + specTez;
    }

}
