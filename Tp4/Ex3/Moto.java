package Tp4.Ex3;

public class Moto extends Motorise {
    private double cylindree;

    public Moto(String modele, Moteur moteur, double carburant, double cylindree) {
        super(modele, moteur, carburant);
        this.cylindree = cylindree;
    }

    public void faireWheelie() {
        System.out.println(getModele() + " fait un wheelie !");
    }

    @Override
    public String toString() {
        return super.toString() 
            + " {Moto, cylindree=" + cylindree + " cm3}";
    }
}
