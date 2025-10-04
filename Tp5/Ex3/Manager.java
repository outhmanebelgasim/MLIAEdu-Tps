package Tp5.Ex3;

public class Manager extends Personne {
	public Manager(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public double calculerSalaire() {
        return this.baseSalaire * 1.30;
    }
}
