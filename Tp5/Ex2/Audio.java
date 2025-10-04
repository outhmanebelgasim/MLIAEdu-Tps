package Tp5.Ex2;

public class Audio extends Media{
	private int duree;
	
	public Audio(String titre, int duree) {
		super(titre);
		this.duree = duree;
	}
	
	public void lire() {
		System.out.println("Lecture de: " + this.titre);
	}
	
	public int getDuree() {
		return this.duree;
	}
}
