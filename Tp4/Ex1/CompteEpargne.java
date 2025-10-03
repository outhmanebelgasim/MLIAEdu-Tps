package Tp4.Ex1;

public class CompteEpargne extends Compte{
	private double tauxInteret;
	
	public CompteEpargne(double soldeInitial, double tauxInteret) {
		super(soldeInitial);
		this.tauxInteret = tauxInteret;
	}
	
	public void appliquerInterets() {
		double solde = getSolde();
        double interets = solde * tauxInteret / 100.0;
        solde += interets;
        System.out.println("CompteEpargne #" + getNumero()
            + " : interet de " + interets);
    }
	
	public void afficherDetails() {
		System.out.println("CompteEpargne #" + getNumero() + " - solde " + getSolde()
		+ " taux = " + tauxInteret + "%");
	}
}
