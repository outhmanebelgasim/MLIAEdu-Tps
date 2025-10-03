package Tp4.Ex1;

public class Compte {
	private static int compteur = 0;
	private final int numero;
	private double solde;
	
	public Compte(double soldeInitial) {
		this.solde = soldeInitial;
		this.numero = ++compteur;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public double getSolde() {
		return this.solde;
	}
	
	public void deposer(double montant) {
		if(montant > 0) {
			this.solde += montant;
			System.out.println("Compte #" + this.numero + " - depot de " + this.solde);
		}
	}
	
	public void retirer(double montant) {
		if(this.solde > 0 && montant >= 0) {
			this.solde -= montant;
			System.out.println("Compte #" + this.numero + " - retrait de " + this.solde);
		}else {
			System.out.println("Compte #" + this.numero + ": Retrait impossible(Montant Insuffisant)");
		}
	}
	
	public void afficherDetails() {
		System.out.println("Compte N#" + this.numero + " - Solde = " + this.solde);
	}
	
}
