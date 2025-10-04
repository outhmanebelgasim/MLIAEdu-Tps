package Tp5.Ex1;

public class Rectangle extends Forme{
	private double hauteur;
	private double largeur;
	
	public Rectangle(String couleur, double hauteur, double largeur) {
		super(couleur);
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	
	public void dessiner() {
		System.out.println("Dessiner un rectangle de couleur = " + this.couleur 
				+ ", hauteur = "+ this.hauteur + " cm" + ", largeur = " + this.largeur + " cm");
	}
}
