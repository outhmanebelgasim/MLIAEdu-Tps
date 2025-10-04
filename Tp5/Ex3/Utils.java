package Tp5.Ex3;

import java.util.List;

public class Utils {
	public static void listerPersonne(List<? extends Personne> personnes) {
		for(Personne p : personnes) {
			p.afficher();
		}
	}
}
