package Tp5.Ex1;

public class Triangle extends Forme {
	private double base;
	private double hauteur;
	
	public Triangle(String couleur, double base, double hauteur) {
		super(couleur);
		this.base = base;
		this.hauteur = hauteur;
	}
	
	public void dessiner() {
		System.out.println("Dessiner un rectangle de couleur = " + this.couleur 
				+ ", base = " + this.base + " cm" + ", hauteur = " + this.hauteur + " cm");
	}
}
