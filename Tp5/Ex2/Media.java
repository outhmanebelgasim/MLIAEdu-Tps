package Tp5.Ex2;

public class Media {
	protected String titre;
	
	public Media(String titre) {
		this.titre = titre;
	}
	
	public void lire() {
		System.out.println("Lecture de: " + this.titre);
	}
	
	public int getDuree() {
		return 0;
	}
}
