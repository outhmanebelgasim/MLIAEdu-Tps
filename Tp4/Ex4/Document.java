package Tp4.Ex4;

public class Document{
	private static int compteur = 0;
	private final int numEng;
	private String titre;
	private String auteur;
	private int anneeEdition;
	
	public Document(String titre, String auteur, int anneeEdition) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneeEdition = anneeEdition;
		this.numEng = ++compteur;
	}
	
	public String getTitre() {
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public int anneeEdition() {
		return anneeEdition;
	}
	public int getNumEng() {
		return this.numEng;
	}
	
	public String toString() {
		return  "Document[N#" + this.numEng + ", titre=" 
				+ this.titre + ", auteur=" + this.auteur + ", annee Edition=" 
				+ this.anneeEdition + "]";
	}
}
