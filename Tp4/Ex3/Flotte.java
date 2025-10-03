package Tp4.Ex3;

public class Flotte {
	private Vehicule[] vehicules = new Vehicule[5];
	private int nb = 0;
	
	public void ajouterVehicule(Vehicule vehicule) {
		if(nb == vehicules.length) {
			Vehicule[] tmp = new Vehicule[vehicules.length * 2];
			System.arraycopy(vehicules, 0, tmp, 0, vehicules.length);
			vehicules = tmp;
		}
		
		vehicules[nb++] = vehicule;
	}
	
	public void afficherTous() {
        System.out.println("Flotte (" + nb + " vehicules) :");
        for (int i = 0; i < nb; i++) {
            System.out.println("  • " + vehicules[i]);
        }
    }
	
	public double distanceTotale() {
		double sum = 0;
		for(int i = 0; i < nb; i++) {
			if(vehicules[i] instanceof Motorise) {
				sum += ((Motorise)vehicules[i]).getTotalKm();
			}
		}
		return sum;
	}
}
