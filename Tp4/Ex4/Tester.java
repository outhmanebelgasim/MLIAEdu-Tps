package Tp4.Ex4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bibliotheque biblio = new Bibliotheque(5);

        Document d1 = new Document("Les Miserables", "Victor Hugo", 1862);
        Document d2 = new Document("Le Petit Prince", "Antoine de Saint-Exupery", 1943);

        biblio.ajouterDocument(d1);
        biblio.ajouterDocument(d2);

        int choix;
        do {
            System.out.println("\n========= Menu ========");
            System.out.println("1 - Ajouter un document");
            System.out.println("2 - Supprimer un document");
            System.out.println("3 - Trouver un document par numero");
            System.out.println("4 - Afficher les auteurs");
            System.out.println("5 - Afficher tous les documents");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.print("Titre : ");
                    String titre = sc.nextLine();
                    System.out.print("Auteur : ");
                    String auteur = sc.nextLine();
                    System.out.print("Annee d'edition : ");
                    int annee = sc.nextInt();
                    sc.nextLine();

                    Document nouveau = new Document(titre, auteur, annee);
                    biblio.ajouterDocument(nouveau);
                    break;

                case 2:
                    System.out.print("Numero du document a supprimer : ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    Document doc = biblio.document(num);
                    if (doc != null) {
                        biblio.supprimerDocument(doc);
                    } else {
                        System.out.println("Document introuvable");
                    }
                    break;

                case 3:
                    System.out.print("Numero du document a rechercher : ");
                    int numCherche = sc.nextInt();
                    sc.nextLine();
                    Document trouve = biblio.document(numCherche);
                    if (trouve != null) {
                        System.out.println("Document trouve : " + trouve);
                    }
                    break;

                case 4:
                    biblio.afficherAuteur();
                    break;

                case 5:
                    biblio.afficherDocument();
                    break;

                case 0:
                    System.out.println("Quitte avec success");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        sc.close();
    }
}
