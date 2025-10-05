package Tp6.Ex1;

public class EmployeHoraire extends Employee{
	private double tauxHoraire;
	private double heuresTravaille;
	
	public EmployeHoraire(String nom, String prenom, double taux, double heures) {
		super(nom, prenom);
		this.tauxHoraire = taux;
		this.heuresTravaille = heures;
	}
	
	public double calculerSalaire() {
		return this.tauxHoraire * this.heuresTravaille;
	}

	public String toString() {
		return "EmployeHoraire [tauxHoraire=" + tauxHoraire + ", heuresTravaille=" + heuresTravaille + ", nom=" + nom
				+ ", prenom=" + prenom + "]";
	}
	
	
}
