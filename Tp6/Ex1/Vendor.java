package Tp6.Ex1;

public class Vendor extends EmployeSalarie {
	private double commission;
	
	public Vendor(String nom, String prenom, double salaireMensuelle, double commission) {
		super(nom, prenom, salaireMensuelle);
		this.commission = commission;
	}
	
	public double calculerSalaire() {
		return getSalaireMensuelle() + this.commission;
	}

	public String toString() {
		return "Vendor [commission=" + commission + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}
