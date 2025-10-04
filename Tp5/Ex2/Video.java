package Tp5.Ex2;

public class Video extends Media{
	private int duree;
	private String resolution;
	
	public Video(String titre, int duree, String resolution) {
		super(titre);
		this.duree = duree;
		this.resolution = resolution;
	}
	
	public void lire() {
		System.out.println("Lecture de: " + this.titre + ", resolution: " 
	                + this.resolution + " px");
	}
	
	public int getDuree() {
		return this.duree;
	}
}
