package Tp5.Ex2;

public class MediaLibrary{
	private Media[] items = new Media[5];
	private int count = 0;
	
	public void add(Media media) {
		if(count == items.length) {
			Media[] tmp = new Media[items.length * 2];
			System.arraycopy(items, 0, tmp, 0, items.length);
			items = tmp;
		}
		items[count++] = media;
	}
	
	public void playAll() {
		System.out.println("======== Lecture de la bibliotheque ========");
		for(int i = 0; i < count; i++) {
			items[i].lire();
		}
	}
	
	public int totalDuration() {
		int somme = 0;
		for(int i = 0; i < count; i++) {
			if(items[i].getDuree() > 0) {
				somme += items[i].getDuree();
			}
		}
		
		return somme;
	}
}
