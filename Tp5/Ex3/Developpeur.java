package Tp5.Ex3;

public class Developpeur extends Personne{
	public Developpeur(String nom, double baseSalaire) {
		super(nom, baseSalaire);
	}
	
	public double calculerSalaire() {
		return this.baseSalaire * 1.10;
	}
}
