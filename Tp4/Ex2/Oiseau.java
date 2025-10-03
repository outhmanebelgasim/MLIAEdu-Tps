package Tp4.Ex2;

public class Oiseau extends Animal{
	private double envergure;
	
	public Oiseau(String nom, int age, double envergure) {
		super(nom, age);
		this.envergure = envergure;
	}
	
	public void voler() {
		System.out.println(this.nom + " s'envole avec une envergure de " 
				+ this.envergure + " m.");
	}
	
	public String toString() {
		return super.toString() + "{Oiseau, envergure=" + this.envergure + "}";
	}
}
