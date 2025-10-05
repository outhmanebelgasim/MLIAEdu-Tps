package Tp6.Ex1;

public class Main {
    public static void main(String[] args) {
        Entreprise ent = new Entreprise();

        ent.ajouterEmployee(
          new EmployeHoraire("El Idrissi","Mohamed", 15.0, 160)
        );
        ent.ajouterEmployee(
          new EmployeSalarie("Bentaleb","Fatima", 2500.0)
        );
        ent.ajouterEmployee(
          new Vendor("Chouaib","Youssef", 2000.0, 500.0)
        );
        ent.ajouterEmployee(
          new EmployeHoraire("Lahlou","Salma", 12.0, 120)
        );

        ent.afficherPaie();
    }
}
