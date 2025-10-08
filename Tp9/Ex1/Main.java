package Tp9.Ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ShoppingList list = new ShoppingList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gestion de la liste de courses");
		while(true) {
			System.out.println("\nCommandes : add, remove, find, show, exit");
            System.out.print("Entrez une commande : ");

            String cmd = sc.nextLine().trim().toLowerCase();
            switch(cmd) {
            	case "add" :
            		System.out.println("Element a ajoute: ");
            		list.add(sc.nextLine().trim());
            		break;
            	case "remove":
                    System.out.print("Element a supprimer: ");
                    list.remove(sc.nextLine().trim());
                    break;
                case "find":
                    System.out.print("Element a rechercher: ");
                    list.contains(sc.nextLine().trim());
                    break;
                case "show":
                    list.display();
                    break;
                case "exit":
                    System.out.println("Au revoir !");
                    sc.close();
                    return;
                default:
                    System.out.println("Commande inconnue.");
            }
		}
	}
}
