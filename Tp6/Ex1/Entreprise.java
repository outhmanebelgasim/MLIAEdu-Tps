package Tp6.Ex1;

public class Entreprise {
	private Employee[] employes;
	private static int nb;
	
	public Entreprise() {
		this.employes = new Employee[4];
		this.nb = 0;
	}
	
	public void ajouterEmployee(Employee e) {
		if(nb == employes.length) {
			Employee[] tmp = new Employee[employes.length * 2];
			System.arraycopy(employes, 0, tmp, 0, employes.length);
			employes = tmp;
		}
		employes[nb++] = e;
	}
	
	public void afficherPaie() {
        System.out.println("=== Bulletin de paie ===");
        for (int i = 0; i < nb; i++) {
            System.out.println(employes[i]);
        }
        System.out.println("Masse salariale totale : " 
            + String.format("%.2f", masseSalariale()) + "$");
    }

    public double masseSalariale() {
        double somme = 0;
        for (int i = 0; i < nb; i++) {
            somme += employes[i].calculerSalaire();
        }
        return somme;
    }
}
