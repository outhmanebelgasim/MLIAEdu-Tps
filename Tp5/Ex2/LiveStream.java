package Tp5.Ex2;

public class LiveStream extends Media{
	private String url;
	
	public LiveStream(String titre, String url) {
		super(titre);
		this.url = url;
	}
	
	public void lire() {
		System.out.println("Regarder le stream: " + this.titre + 
					" sur le lien suivant: " + this.url);	
	}
	
	public int getDuree() {
		return -1;
	}
}
