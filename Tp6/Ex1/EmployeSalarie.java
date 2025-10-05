package Tp6.Ex1;

public class EmployeSalarie extends Employee {
	private double salaireMensuelle;
	
	public EmployeSalarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaireMensuelle = salaire;
	}
	
	public double getSalaireMensuelle() {
		return this.salaireMensuelle;
	}
	
	public double calculerSalaire() {
		return salaireMensuelle;
	}

	public String toString() {
		return "EmployeSalarie [salaireMensuelle=" + salaireMensuelle + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}
