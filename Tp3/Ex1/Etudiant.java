package Tp3.Ex1;

public class Etudiant {
	private static int compteur = 0;
	private final int id;
	private String nom;
	private String prenom;
	private double[] notes;
	private int nbNotes;
	
	public Etudiant(String nom, String prenom) {
		this.id = ++compteur;
		this.nom = nom;
		this.prenom = prenom;
		this.notes = new double[5];
		this.nbNotes = 0;
	}
	
	
	public void ajouterNote(double note) {
		if(nbNotes == notes.length) {
			double[] tmp = new double[notes.length * 2];
			System.arraycopy(notes, 0, tmp, 0, notes.length);
			notes = tmp;
		}
		notes[nbNotes++] = note;
	}
	
	public double calculerMoyenne() {
		if(this.nbNotes == 0) return 0.0;
		double somme = 0;
		for(int i = 0; i < nbNotes; i++) {
			somme += notes[i];
		}
		
		return (somme / nbNotes);
	}
	
	public void afficheNotes() {
		 System.out.print("Notes de " + this.nom + " " + this.prenom + " : ");
		for(int i = 0; i < nbNotes; i++) {
			System.out.print(notes[i]);
			if(i < nbNotes - 1) System.out.print(", ");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
	    return "Etudiant[id=" + id +
	           ", nom=" + nom +
	           ", prenom=" + prenom +
	           ", moyenne=" + String.format("%.2f", calculerMoyenne()) +
	           "]";
	}
}
