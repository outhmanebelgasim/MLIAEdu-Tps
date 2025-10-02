package Tp3.Ex1;

public class Main {
	public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Outhmane", "Belgsim");
        Etudiant e2 = new Etudiant("Hatim", "Touffahi");

        e1.ajouterNote(14.5);
        e1.ajouterNote(12.0);
        e1.ajouterNote(16.0);
        e2.ajouterNote(10.0);
        e2.ajouterNote(13.5);

        e1.afficheNotes();
        System.out.println(e1);

        e2.afficheNotes();
        System.out.println(e2);
    }
}
