package Tp5.Ex3;


public abstract class Personne {
	protected final String nom;
	protected final double baseSalaire;
	
	public Personne(String nom, double basSalaire) {
		this.nom = nom;
		this.baseSalaire = basSalaire;
	}
	
	public abstract double calculerSalaire();
	public void afficher() {
		System.out.printf("Le nom: %s, mon salaire: %.2f\n", this.nom, calculerSalaire());
	}
}
