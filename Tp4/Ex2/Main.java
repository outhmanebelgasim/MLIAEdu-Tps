package Tp4.Ex2;

public class Main {
	public static void main(String[] args) {
		Zoo monZoo = new Zoo();
		
		monZoo.ajouterAnimal(new Mammifere("Lion", 5, "Doree"));
		monZoo.ajouterAnimal(new Oiseau("Aigle", 3, 2.3));
        monZoo.ajouterAnimal(new Reptile("Crocodile", 12, "Epaisse"));
        monZoo.ajouterAnimal(new Mammifere("Girafe", 7, "Tachetee"));
        monZoo.ajouterAnimal(new Oiseau("Perroquet", 2, 0.4));
        monZoo.ajouterAnimal(new Reptile("Serpent", 4, "Lisse"));
        
        monZoo.afficherTous();
        System.out.println();
        
        Animal a1 = new Mammifere("Elephant", 10, "Gris");
        monZoo.ajouterAnimal(a1);
        ((Mammifere)a1).allaiter();
        
        Animal a2 = new Oiseau("Autruche", 6, 1.8);
        monZoo.ajouterAnimal(a2);
        ((Oiseau)a2).voler();
	}
}
