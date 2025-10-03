package Tp4.Ex3;

public class Voiture extends Motorise {
    private int nbPortes;

    public Voiture(String modele, Moteur moteur, double carburant, int nbPortes) {
        super(modele, moteur, carburant);
        this.nbPortes = nbPortes;
    }

    public void klaxonner() {
        System.out.println(getModele() + " klaxonne : « Pouet ! »");
    }

    @Override
    public String toString() {
        return super.toString() 
            + " {Voiture, portes=" + nbPortes + "}";
    }
}
