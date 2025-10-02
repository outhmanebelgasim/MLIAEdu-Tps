package Tp3.Ex2;

public class Etudiant {
	private static int compteur = 0;
    private final int id;
    private String nom;
    private String prenom;
    private Filiere filiere;
    
    public Etudiant(String nom, String prenom) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    
    public int getId() { 
    	return id; 
    }
    
    public String getNom() { 
    	return nom; 
    }
    
    public String getPrenom() { 
    	return prenom; 
    }
    
    public Filiere getFiliere() { 
    	return filiere; 
    }
    
    @Override
    public String toString() {
        String fil = (filiere != null) ? filiere.getNom() : "Aucune";
        return "Etudiant[id=" + id +
               ", nom=" + nom +
               ", prenom=" + prenom +
               ", filiere=" + fil +
               "]";
    }
}
