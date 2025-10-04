package Tp5.Ex1;

public class Forme {
	protected String couleur;
	
	public Forme(String couleur) {
		this.couleur = couleur;
	}
	
	public void dessiner() {
		System.out.println("Dessiner un forme de couleur = " + this.couleur);
	}
}
