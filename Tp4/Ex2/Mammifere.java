package Tp4.Ex2;

public class Mammifere extends Animal{
	private String couleur;
	
	public Mammifere(String nom, int age, String couleur) {
		super(nom, age);
		this.couleur = couleur;
	}
	
	public void allaiter() {
		System.out.println(this.nom + " allaiter ses petits");
	}
	
	public String toString() {
		return super.toString() + "{Mammifere, fourrure=" + this.couleur + "}";
	}
}
