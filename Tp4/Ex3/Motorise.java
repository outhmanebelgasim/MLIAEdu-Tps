package Tp4.Ex3;

public class Motorise extends Vehicule{
	protected Moteur moteur;
	protected double niveauCarburant;
	private double kmTotal;
	
	public Motorise(String modele, Moteur moteur, double niveauCarburantInitial) {
		super(modele);
		this.moteur = moteur;
		this.niveauCarburant = niveauCarburantInitial;
	}
	
	public double getTotalKm() {
		return this.kmTotal;
	}
	
	public void demarrer() {
		System.out.println(toString() + " demarrer avec " + this.niveauCarburant + " unite et moteur " + this.moteur);
	}
	
	public void rouler(double km) {
		double consommation = km * 0.1;
		if(consommation < this.niveauCarburant) {
			this.niveauCarburant -= consommation;
			this.kmTotal += km;
			System.out.println(this.getModele() + " roule " + this.kmTotal + ", reste " 
							+ this.niveauCarburant + " unites");
		}else {
			System.out.println("Carburant insuffisant pour " 
	                + km + " km sur " + this.getModele() + " (reste : " 
	                + niveauCarburant + " unites)");
		}
	}
	
	public void refule(double carburant) {
		this.niveauCarburant += carburant;
		System.out.println(this.getModele() + " ravitaille de " + carburant + " unites (nouveau niveau: " 
								+ this.niveauCarburant + ")");
	}
	
	public String toString() {
		return super.toString() + " {" 
	            + this.moteur + ", carburant=" 
	            + String.format("%.1f", niveauCarburant) + "}";
	}
}
