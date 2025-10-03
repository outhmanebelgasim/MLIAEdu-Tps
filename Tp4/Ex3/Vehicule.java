package Tp4.Ex3;

public class Vehicule {
	private final int id;
	private static int compteur = 0;
	private String modele;
	
	public Vehicule(String modele) {
		this.modele = modele;
		this.id = ++compteur;
	}
	
	public String getModele() {
		return this.modele;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String toString() {
		return "Vehicule#" + id + " [" + modele + "]";
	}
}
