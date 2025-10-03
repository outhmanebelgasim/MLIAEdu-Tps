package Tp4.Ex3;

public class Moteur {
    private String type;
    private int puissance;

    public Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    public String toString() {
        return type + " " + puissance + "ch";
    }
}
