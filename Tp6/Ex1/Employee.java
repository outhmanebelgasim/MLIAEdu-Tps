package Tp6.Ex1;

public abstract class Employee {
	protected String nom, prenom;
	
	public Employee(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double calculerSalaire();
	public String toString() {
		return "Employee[nom=" + this.nom + ", prenom=" + this.prenom + "]"; 
	}
}
