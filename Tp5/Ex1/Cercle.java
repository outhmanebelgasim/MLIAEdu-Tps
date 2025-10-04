package Tp5.Ex1;

public class Cercle extends Forme {
	private double rayon;
	
	public Cercle(String couleur, double rayon) {
		super(couleur);
		this.rayon = rayon;
	}
	
	public void dessiner() {
		System.out.println("Dessiner une cercle de couleur = " + couleur + ", rayon = " + this.rayon + " cm");
	}
}
