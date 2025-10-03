package Tp4.Ex4;

public class Bibliotheque {
	private Document[] documents = new Document[5];
	private int capacite;
	private int nb = 0;
	
	public Bibliotheque(int capacite) {
		this.capacite = capacite;
	}
	
	public int getCapacite() {
		return this.capacite;
	}
	
	public boolean ajouterDocument(Document doc) {
		if(doc != null) {
			if(nb == documents.length) {
				Document[] tmp = new Document[documents.length * 2];
				System.arraycopy(documents, 0, tmp, 0, documents.length);
				documents = tmp;
			}
			
			documents[nb++] = doc;
			System.out.println(doc + " est ajouter a la bibliotheque");
			return true;
		} else return false;
	}
	
	public boolean supprimerDocument(Document doc) {
		if(doc != null) {
			if(nb == 0) {
				System.out.println("La bibliotheque est vide");
				return false;
			}else {
				for(int i = 0; i < nb; i++) {
					if(documents[i].equals(doc)) {
						for(int j = i; j < nb -1; j++) {
							documents[j] = documents[j+1];
						}
					}
					documents[--nb] = null;
					System.out.println(doc + " est supprimer de la bibliotheque");
					return true;
				}
				System.out.println(doc + " Non trouvable");
				return false;
			}
		}else return false;
	}
	
	public void afficherDocument() {
		System.out.println("Bibliotheque: " + this.nb + " documents");
		for(int i = 0; i < nb; i++) {
			System.out.println(" - " + documents[i]);
		}
	}
	
	public Document document(int numEng) {
		for(int i = 0; i < nb; i++) {
			if(numEng == documents[i].getNumEng()) {
				return documents[i];
			}else {
				System.out.println("Document avec num #" + numEng + " n'est pas trouve");
			}
		}
		return null;
	}
	
	public void afficherAuteur() {
		for(int i = 0; i < nb; i++) {
			System.out.println("Document N# " + documents[i].getNumEng() + " - Titre = " + documents[i].getTitre() 
					+ " - Auteur = " + documents[i].getAuteur());
		}
	}
}
