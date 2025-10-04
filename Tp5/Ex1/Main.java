package Tp5.Ex1;

public class Main {
	public static void main(String[] args) {
		Forme[] formes = new Forme[] {
			new Cercle("Rouge", 20),
			new Rectangle("Bleu", 10, 15),
			new Triangle("Orange", 12, 7),
			new Forme("Blanc")
		};
		
		for(Forme forme : formes) {
			forme.dessiner();
		}
	}
}
