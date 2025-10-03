package Tp4.Ex3;

public class VoitureElectrique extends Motorise {
    public VoitureElectrique(String modele, Moteur moteur, double batterieInitial) {
        super(modele, moteur, batterieInitial);
    }

    @Override
    public void refule(double kWh) {
        niveauCarburant += kWh;
        System.out.println(getModele() + " recharge " 
            + kWh + " kWh (niveau=" 
            + niveauCarburant + ")");
    }

    @Override
    public String toString() {
        return super.toString()
            .replace("carburant", "batterie") 
            + " {Electrique}";
    }
}