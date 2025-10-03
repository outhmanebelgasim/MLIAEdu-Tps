package Tp4.Ex1;

public class CompteCourant extends Compte{
	private double decouvertAutorise;

	public CompteCourant(double soldeInitial, double decouvertAutorise) {
		super(soldeInitial);
		this.decouvertAutorise = decouvertAutorise;
	}
	
	public void retirer(double montant) {
		double solde = getSolde();
		if(montant > 0 && solde + this.decouvertAutorise >= montant) {
			solde -= montant;
			System.out.println("CompteCourant #" + getNumero()
            + " : retrait de " + montant);
		}else {
			System.out.println("CompteCourant #" + getNumero()
            + " : retrait impossible (decouvert max depasse)");
		}
	}
	
	public void afficherDetails() {
        System.out.println("CompteCourant #" + getNumero()
            + " — solde = " + getSolde()
            + ", découvert autorisé = " + decouvertAutorise);
    }

}
